package dev.paie.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.paie.controller.dto.RemunerationEmployeDTOGet;
import dev.paie.controller.dto.RemunerationEmployeDTOPost;
import dev.paie.controller.dto.RemunerationEmployeMatricule;
import dev.paie.entites.RemunerationEmploye;
import dev.paie.exception.CollegueInvalideException;
import dev.paie.service.RemunerationEmployeService;

/**
 * @author Cécile Peyras
 *
 */
@RestController
@RequestMapping (value = "/remuneration_employes")
public class RemunerationEmployeController {

	@Autowired
	RemunerationEmployeService remunerationEmployeService;


	@PostMapping
	public RemunerationEmploye ajouterRemunerationEmploye(@Valid @RequestBody RemunerationEmployeDTOPost remunerationEmployeDTOPost) {

		RemunerationEmploye remunerationEmploye = remunerationEmployeService.creerRemunerationEmploye(remunerationEmployeDTOPost);

		return remunerationEmploye;

	}
	
	@ExceptionHandler({ CollegueInvalideException.class })
	public ResponseEntity<String> errorCollegueInvalideException() {

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Le matricule n'existe pas");

	}
	
	@GetMapping
	public List<RemunerationEmployeDTOGet> afficherRemunerationEmploye(){
		
		List<RemunerationEmployeDTOGet> listeRemunerationEmployeDTOGet = remunerationEmployeService.afficherRemunerationEmployeDTOGet(); 
		
		return listeRemunerationEmployeDTOGet; 
		
	}
	
	@GetMapping (params = "matricules")
	public List<RemunerationEmployeMatricule> afficherMatricule(){
		
		List<RemunerationEmployeMatricule> listeEmployeMatricules = remunerationEmployeService.afficherMatricule(); 
		
		return listeEmployeMatricules; 
		
	}

}
