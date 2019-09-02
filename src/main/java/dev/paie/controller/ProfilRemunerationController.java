package dev.paie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import dev.paie.service.ProfilRemunerationService;

@RestController
public class ProfilRemunerationController {
	
	@Autowired
	ProfilRemunerationService profilRemunerationService; 
	
	@GetMapping (value = "/profils_remuneration")
	public List<ProfilRemunerationDTO> afficherProfilRemuneration(){
		
		List<ProfilRemunerationDTO> listeProfilRemuneration = profilRemunerationService.afficherIdCode();
		
		return listeProfilRemuneration; 
		
	}

}
