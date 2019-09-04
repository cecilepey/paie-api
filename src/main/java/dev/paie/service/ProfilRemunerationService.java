package dev.paie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.paie.controller.dto.ProfilRemunerationDTO;

import dev.paie.repository.ProfilRemunerationRepository;
@Service
public class ProfilRemunerationService {

	@Autowired
	ProfilRemunerationRepository profilRemunerationRepo; 

	public List<ProfilRemunerationDTO> afficherCode() {
			
		return profilRemunerationRepo.findAllWithCodeDTO(); 
		
	}
	
}
