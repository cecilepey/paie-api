package dev.paie.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.joda.LocalDateParser;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

import dev.paie.controller.dto.BulletinSalaireDTO;
import dev.paie.controller.dto.BulletinSalairePost;
import dev.paie.controller.dto.PeriodeDTO;
import dev.paie.entites.BulletinSalaire;
import dev.paie.entites.Cotisation;
import dev.paie.entites.Periode;
import dev.paie.entites.RemunerationEmploye;
import dev.paie.repository.BulletinSalaireRepository;
import dev.paie.repository.PeriodeRepository;
import dev.paie.repository.RemunerationEmployeRepository;
import dev.paie.utils.CalculSalaire;

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
	
	@Autowired
	CalculSalaire calculSalaire; 

	public List<BulletinSalaireDTO> afficherBulletinSalaireDTO() {
		
			 
		 

		List<BulletinSalaire> listeBulletinSalaire = bulletinSalaireRepo.findAll();

		List<BulletinSalaireDTO> listeBulletinSalaireDTO = new ArrayList<>();

		for (BulletinSalaire bulletinSalaire : listeBulletinSalaire) {

			

			//Calcul Salaire
			BigDecimal salaireBrut = calculSalaire.calculSalaireBrut(bulletinSalaire); 
			BigDecimal salaireNetImposable = calculSalaire.calculSalaireNetImposable(bulletinSalaire, salaireBrut); 
			BigDecimal salaireNet = calculSalaire.calculSalaireNet(bulletinSalaire, salaireBrut, salaireNetImposable); 
			
			
			//Création du DTO
			BulletinSalaireDTO bulletinSalaireDTO = new BulletinSalaireDTO();
			
			bulletinSalaireDTO.setDateHeureCreation(bulletinSalaire.getDateHeureCreation().toString());

			bulletinSalaireDTO.setDateDebut(bulletinSalaire.getPeriode().getDateDebut().toString());

			bulletinSalaireDTO.setDateDebut(bulletinSalaire.getPeriode().getDateFin().toString());

			bulletinSalaireDTO.setMatricule(bulletinSalaire.getRemunerationEmploye().getMatricule());
			

			bulletinSalaireDTO.setSalaireBrut(salaireBrut.toString());

			bulletinSalaireDTO.setSalaireNetImposable(salaireNetImposable.toString());

			bulletinSalaireDTO.setSalaireNet(salaireNet.toString());

			listeBulletinSalaireDTO.add(bulletinSalaireDTO);

		}

		return listeBulletinSalaireDTO;

}

	public BulletinSalaireDTO creerBulletinSalaire(BulletinSalairePost bulletinSalairePost) {

		// Creation du bulletin de salaire et enregistrement

		BulletinSalaire bulletinSalaire = new BulletinSalaire();

		LocalDate dateDebut = LocalDate.parse(bulletinSalairePost.getDateDebut(),
				DateTimeFormatter.ofPattern("yyyy-MM-dd"));

		bulletinSalaire.setPeriode(periodeRepo.findPeriodeByDateDebut(dateDebut));

		bulletinSalaire.setRemunerationEmploye(
				remunerationEmployeRepo.findPeriodeByMatricule(bulletinSalairePost.getMatricule()));

		String primeExceptionnelle = bulletinSalairePost.getPrimeExceptionnelle();

		bulletinSalaire.setPrimeExceptionnelle(new BigDecimal(primeExceptionnelle));

		bulletinSalaire.setDateHeureCreation(ZonedDateTime.now());

		bulletinSalaireRepo.save(bulletinSalaire);
		
		//Calcul du salaire
		
		BigDecimal salaireBrut = calculSalaire.calculSalaireBrut(bulletinSalaire); 
		
		BigDecimal salaireNetImposable = calculSalaire.calculSalaireNetImposable(bulletinSalaire, salaireBrut); 
		
		BigDecimal salaireNet = calculSalaire.calculSalaireNet(bulletinSalaire, salaireBrut, salaireNetImposable); 


		// creation du bulletin DTO pour l'affichage

		BulletinSalaireDTO bulletinSalaireDTO = new BulletinSalaireDTO();

		bulletinSalaireDTO.setDateDebut(bulletinSalairePost.getDateDebut());

		bulletinSalaireDTO.setDateFin(bulletinSalairePost.getDateFin());

		bulletinSalaireDTO.setMatricule(bulletinSalairePost.getMatricule());

		bulletinSalaireDTO.setDateHeureCreation(ZonedDateTime.now().toString());
		bulletinSalaireDTO.setSalaireBrut(salaireBrut.toString());

		bulletinSalaireDTO.setSalaireNetImposable(salaireNetImposable.toString());

		bulletinSalaireDTO.setSalaireNet(salaireNet.toString());

		return bulletinSalaireDTO;

	}
}
