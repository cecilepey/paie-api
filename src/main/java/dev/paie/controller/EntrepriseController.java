package dev.paie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import dev.paie.service.EntrepriseService;

@RestController
public class EntrepriseController {

	
	@Autowired
	EntrepriseService entrepriseService; 
	
	
	@GetMapping (value = "/entreprises")
	public List<EntrepriseDTO> afficherCodeDenominationEntreprise(){
		
		List<EntrepriseDTO> listeEntrepriseDTO = entrepriseService.afficherCodeDenomination();
		
		return listeEntrepriseDTO; 
		
	}
	

	
	
	
}
