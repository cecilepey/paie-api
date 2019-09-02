package dev.paie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import dev.paie.controller.ProfilRemunerationDTO;

import dev.paie.entites.ProfilRemuneration;

import dev.paie.repository.ProfilRemunerationRepository;
@Service
public class ProfilRemunerationService {

	@Autowired
	ProfilRemunerationRepository ProfilRemunerationRepo; 

	public List<ProfilRemunerationDTO> afficherIdCode() {
		
		List<ProfilRemuneration> listeProfilRemuneration = ProfilRemunerationRepo.findAll(); 	
		
		List<ProfilRemunerationDTO> listeProfilRemunerationDTO = new ArrayList<>(); 
		
		
		
		for (ProfilRemuneration liste : listeProfilRemuneration) {
			
			ProfilRemunerationDTO profilRemunerationDTO = new ProfilRemunerationDTO(); 
			
			profilRemunerationDTO.setCode(liste.getCode());
			profilRemunerationDTO.setId(liste.getId());
			
			listeProfilRemunerationDTO.add(profilRemunerationDTO); 
			
		}
		
		
		return listeProfilRemunerationDTO;
		
	}
	
}
