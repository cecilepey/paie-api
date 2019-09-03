package dev.paie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.paie.controller.dto.EntrepriseDTO;
import dev.paie.entites.Entreprise;
import dev.paie.repository.EntrepriseRepository;

@Service
public class EntrepriseService {
	
	@Autowired
	EntrepriseRepository entrepriseRepo; 

	public List<EntrepriseDTO> afficherCodeDenomination() {
		
	
		return entrepriseRepo.findAllWithCodeDenomination();
		
	}
	
	
}
