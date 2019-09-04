package dev.paie.utils;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Component;

import dev.paie.controller.dto.SalairesDTO;
import dev.paie.entites.BulletinSalaire;
import dev.paie.entites.Cotisation;

@Component
public class CalculSalaire {

	public SalairesDTO calculSalaires(BulletinSalaire bulletinSalaire) {
		
		SalairesDTO salaires = new SalairesDTO(); 

		BigDecimal nbHeuresBase = bulletinSalaire.getRemunerationEmploye().getGrade().getNbHeuresBase();

		BigDecimal tauxBase = bulletinSalaire.getRemunerationEmploye().getGrade().getTauxBase();

		BigDecimal salaireBrut = nbHeuresBase.multiply(tauxBase).add(bulletinSalaire.getPrimeExceptionnelle()); 
		
		List<Cotisation> listeCotisation = bulletinSalaire.getRemunerationEmploye().getProfilRemuneration()
				.getCotisations();

		BigDecimal chargesSalarialesNonImposables = new BigDecimal(0);
		
		BigDecimal chargesSalarialesImposables = new BigDecimal(0);

		for (Cotisation cotisation : listeCotisation) {
			if (cotisation.getTauxSalarial() != null) {
				if (!cotisation.getImposable()) {
					chargesSalarialesNonImposables = chargesSalarialesNonImposables
							.add(cotisation.getTauxSalarial().multiply(salaireBrut));
				} else if (cotisation.getImposable()) {
					chargesSalarialesImposables = chargesSalarialesImposables
							.add(cotisation.getTauxSalarial().multiply(salaireBrut));
				}
			}
		}

		salaires.setSalaireBrut(salaireBrut);
		salaires.setSalaireNetImposable(salaires.getSalaireBrut().subtract(chargesSalarialesNonImposables));
		salaires.setSalaireNet(salaires.getSalaireNetImposable().subtract(chargesSalarialesNonImposables));
		
		
		

		return salaires;
	}

}
