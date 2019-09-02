package dev.paie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import dev.paie.service.PaieService;

@RestController
public class paieController {

	
	@Autowired
	PaieService paieService; 
	
	@RequestMapping (value = "/entreprises", method = RequestMethod.GET)
	public List<EntrepriseDTO> afficherCodeDenominationEntreprise(){
		
		List<EntrepriseDTO> listeEntrepriseDTO = paieService.afficherCodeDenomination();
		
		return listeEntrepriseDTO; 
		
	}
	
	
	
}
