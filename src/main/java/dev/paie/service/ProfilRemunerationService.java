package dev.paie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.paie.controller.dto.ProfilRemunerationDTO;
import dev.paie.entites.ProfilRemuneration;

import dev.paie.repository.ProfilRemunerationRepository;
@Service
public class ProfilRemunerationService {

	@Autowired
	ProfilRemunerationRepository ProfilRemunerationRepo; 

	public List<ProfilRemunerationDTO> afficherCode() {
		
		List<ProfilRemuneration> listeProfilRemuneration = ProfilRemunerationRepo.findAll(); 	
		
		List<ProfilRemunerationDTO> listeProfilRemunerationDTO = new ArrayList<>(); 
		
		
		
		for (ProfilRemuneration liste : listeProfilRemuneration) {
			
			ProfilRemunerationDTO profilRemunerationDTO = new ProfilRemunerationDTO(); 
			
			profilRemunerationDTO.setCode(liste.getCode());

			listeProfilRemunerationDTO.add(profilRemunerationDTO); 
			
		}
		
		
		return listeProfilRemunerationDTO;
		
	}
	
}
