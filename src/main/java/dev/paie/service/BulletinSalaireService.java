package dev.paie.service;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.paie.controller.dto.BulletinSalaireDTO;
import dev.paie.controller.dto.BulletinSalairePost;
import dev.paie.entites.BulletinSalaire;
import dev.paie.entites.Cotisation;
import dev.paie.entites.Periode;
import dev.paie.entites.RemunerationEmploye;
import dev.paie.repository.BulletinSalaireRepository;
import dev.paie.repository.PeriodeRepository;
import dev.paie.repository.RemunerationEmployeRepository;

/**
 * @author Cécile Peyras
 *
 */
@Service
public class BulletinSalaireService {

	@Autowired
	BulletinSalaireRepository bulletinSalaireRepo;

	@Autowired
	RemunerationEmployeRepository remunerationEmployeRepo;

	@Autowired
	PeriodeRepository periodeRepo;

	public List<BulletinSalaireDTO> afficherBulletinSalaireDTO() {

		List<BulletinSalaire> listeBulletinSalaire = bulletinSalaireRepo.findAll();

		List<BulletinSalaireDTO> listeBulletinSalaireDTO = new ArrayList<>();

		for (BulletinSalaire bulletinSalaire : listeBulletinSalaire) {

			BulletinSalaireDTO bulletinSalaireDTO = new BulletinSalaireDTO();

			bulletinSalaireDTO.setDateHeureCreation(bulletinSalaire.getDateHeureCreation());

			bulletinSalaireDTO.setDateDebut(bulletinSalaire.getPeriode().getDateDebut());

			bulletinSalaireDTO.setDateFin(bulletinSalaire.getPeriode().getDateFin());

			bulletinSalaireDTO.setMatricule(bulletinSalaire.getRemunerationEmploye().getMatricule());

			BigDecimal nbHeuresBase = bulletinSalaire.getRemunerationEmploye().getGrade().getNbHeuresBase();

			BigDecimal tauxBase = bulletinSalaire.getRemunerationEmploye().getGrade().getTauxBase();

			BigDecimal SalaireBrut = nbHeuresBase.multiply(tauxBase).add(bulletinSalaire.getPrimeExceptionnelle());

			bulletinSalaireDTO.setSalaireBrut(SalaireBrut);

			List<Cotisation> listeCotisation = bulletinSalaire.getRemunerationEmploye().getProfilRemuneration()
					.getCotisations();

			BigDecimal chargesSalarialesImposables = new BigDecimal(0);

			BigDecimal chargesSalarialesNonImposables = new BigDecimal(0);

			for (Cotisation cotisation : listeCotisation) {
				if (cotisation.getTauxSalarial() != null) {
					if (cotisation.getImposable()) {
						chargesSalarialesImposables = chargesSalarialesImposables
								.add(cotisation.getTauxSalarial().multiply(SalaireBrut));
					} else if (!cotisation.getImposable()) {
						chargesSalarialesNonImposables = chargesSalarialesNonImposables
								.add(cotisation.getTauxSalarial().multiply(SalaireBrut));
					}
				}
			}

			BigDecimal salaireNetImposable = SalaireBrut.subtract(chargesSalarialesNonImposables);
			BigDecimal salaireNet = salaireNetImposable.subtract(chargesSalarialesImposables);

			bulletinSalaireDTO.setSalaireNetImposable(salaireNetImposable);

			bulletinSalaireDTO.setSalaireNet(salaireNet);

			listeBulletinSalaireDTO.add(bulletinSalaireDTO);

		}

		return listeBulletinSalaireDTO;

	}

	public BulletinSalaireDTO creerBulletinSalaire(BulletinSalairePost bulletinSalairePost) {
		BulletinSalaireDTO bulletinSalaireDTO = new BulletinSalaireDTO();
		BulletinSalaire bulletinSalaire = new BulletinSalaire();

		List<Periode> listePeriode = periodeRepo.findAll();
		for (Periode periode : listePeriode) {
			if (bulletinSalairePost.getPeriode().getDateDebut().equals(periode.getDateDebut())) {
				bulletinSalaireDTO.setDateDebut(periode.getDateDebut());
				bulletinSalaireDTO.setDateFin(periode.getDateFin());
				bulletinSalaire.setPeriode(periode);
			}
		}

		List<RemunerationEmploye> listeRemunerationEmploye = remunerationEmployeRepo.findAll();

		for (RemunerationEmploye remunerationEmploye : listeRemunerationEmploye) {
			if (bulletinSalairePost.getMatricule().equals(remunerationEmploye.getMatricule())) {
				bulletinSalaireDTO.setMatricule(remunerationEmploye.getMatricule());
				bulletinSalaire.setRemunerationEmploye(remunerationEmploye);
			}
		}

		bulletinSalaire.setPrimeExceptionnelle(bulletinSalairePost.getPrime());

		bulletinSalaireDTO.setDateHeureCreation(ZonedDateTime.now());
		bulletinSalaire.setDateHeureCreation(ZonedDateTime.now());

		bulletinSalaireRepo.save(bulletinSalaire);

		BigDecimal nbHeuresBase = bulletinSalaire.getRemunerationEmploye().getGrade().getNbHeuresBase();

		BigDecimal tauxBase = bulletinSalaire.getRemunerationEmploye().getGrade().getTauxBase();

		BigDecimal SalaireBrut = nbHeuresBase.multiply(tauxBase).add(bulletinSalairePost.getPrime());

		bulletinSalaireDTO.setSalaireBrut(SalaireBrut);

		List<Cotisation> listeCotisation = bulletinSalaire.getRemunerationEmploye().getProfilRemuneration()
				.getCotisations();

		BigDecimal chargesSalarialesImposables = new BigDecimal(0);

		BigDecimal chargesSalarialesNonImposables = new BigDecimal(0);

		for (Cotisation cotisation : listeCotisation) {
			if (cotisation.getTauxSalarial() != null) {
				if (cotisation.getImposable()) {
					chargesSalarialesImposables = chargesSalarialesImposables
							.add(cotisation.getTauxSalarial().multiply(SalaireBrut));
				} else if (!cotisation.getImposable()) {
					chargesSalarialesNonImposables = chargesSalarialesNonImposables
							.add(cotisation.getTauxSalarial().multiply(SalaireBrut));
				}
			}
		}

		BigDecimal salaireNetImposable = SalaireBrut.subtract(chargesSalarialesNonImposables);
		BigDecimal salaireNet = salaireNetImposable.subtract(chargesSalarialesImposables);

		bulletinSalaireDTO.setSalaireNetImposable(salaireNetImposable);

		bulletinSalaireDTO.setSalaireNet(salaireNet);

		return bulletinSalaireDTO;

	}
}
