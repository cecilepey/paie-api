package dev.paie.utils;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Component;

import dev.paie.entites.BulletinSalaire;
import dev.paie.entites.Cotisation;

@Component
public class CalculSalaire {

	public BigDecimal calculSalaireBrut(BulletinSalaire bulletinSalaire) {

		BigDecimal nbHeuresBase = bulletinSalaire.getRemunerationEmploye().getGrade().getNbHeuresBase();

		BigDecimal tauxBase = bulletinSalaire.getRemunerationEmploye().getGrade().getTauxBase();

		BigDecimal salaireBrut = nbHeuresBase.multiply(tauxBase).add(bulletinSalaire.getPrimeExceptionnelle());

		return salaireBrut;
	}

	public BigDecimal calculSalaireNetImposable(BulletinSalaire bulletinSalaire, BigDecimal salaireBrut) {

		List<Cotisation> listeCotisation = bulletinSalaire.getRemunerationEmploye().getProfilRemuneration()
				.getCotisations();

		BigDecimal chargesSalarialesNonImposables = new BigDecimal(0);

		for (Cotisation cotisation : listeCotisation) {
			if (cotisation.getTauxSalarial() != null) {
				if (!cotisation.getImposable()) {
					chargesSalarialesNonImposables = chargesSalarialesNonImposables
							.add(cotisation.getTauxSalarial().multiply(salaireBrut));
				}
			}
		}

		BigDecimal salaireNetImposable = salaireBrut.subtract(chargesSalarialesNonImposables);

		return salaireNetImposable;

	}

	public BigDecimal calculSalaireNet(BulletinSalaire bulletinSalaire, BigDecimal salaireBrut,
			BigDecimal salaireNetImposable) {

		List<Cotisation> listeCotisation = bulletinSalaire.getRemunerationEmploye().getProfilRemuneration()
				.getCotisations();

		BigDecimal chargesSalarialesImposables = new BigDecimal(0);

		for (Cotisation cotisation : listeCotisation) {
			if (cotisation.getTauxSalarial() != null) {
				if (cotisation.getImposable()) {
					chargesSalarialesImposables = chargesSalarialesImposables
							.add(cotisation.getTauxSalarial().multiply(salaireBrut));
				}
			}
		}

		BigDecimal salaireNet = salaireNetImposable.subtract(chargesSalarialesImposables);

		return salaireNet;

	}

}
