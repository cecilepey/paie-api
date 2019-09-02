package dev.paie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.paie.controller.EntrepriseDTO;
import dev.paie.entites.Entreprise;
import dev.paie.repository.EntrepriseRepository;

@Service
public class PaieService {
	
	@Autowired
	EntrepriseRepository entrepriseRepo; 

	public List<EntrepriseDTO> afficherCodeDenomination() {
		
		List<Entreprise> listeEntreprise = entrepriseRepo.findAll(); 	
		
		List<EntrepriseDTO> listeEntrepriseDTO = new ArrayList<EntrepriseDTO>(); 
		
		
		
		for (Entreprise liste : listeEntreprise) {
			
			EntrepriseDTO entrepriseDTO = new EntrepriseDTO(); 
			
			entrepriseDTO.setCode(liste.getCode());
			entrepriseDTO.setDenomination(liste.getDenomination());
			
			listeEntrepriseDTO.add(entrepriseDTO); 
			
		}
		
		
		return listeEntrepriseDTO;
		
	}
	
	
}
