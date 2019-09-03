package dev.paie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.paie.controller.dto.RemunerationEmployeDTOGet;
import dev.paie.controller.dto.RemunerationEmployeDTOPost;
import dev.paie.entites.RemunerationEmploye;
import dev.paie.exception.CollegueInvalideException;
import dev.paie.repository.RemunerationEmployeRepository;
import dev.paie.service.RemunerationEmployeService;

/**
 * @author Cécile Peyras
 *
 */
@RestController
public class RemunerationEmployeController {

	@Autowired
	RemunerationEmployeService remunerationEmployeService;


	@PostMapping(value = "/remuneration_employes")
	public RemunerationEmploye ajouterRemunerationEmploye(@RequestBody RemunerationEmployeDTOPost remunerationEmployeDTOPost) {

		String matricule = remunerationEmployeDTOPost.getMatricule();

		remunerationEmployeService.validerMatricule(matricule);

		RemunerationEmploye remunerationEmploye = remunerationEmployeService.transformerDTO(remunerationEmployeDTOPost);

		return remunerationEmploye;

	}
	
	@ExceptionHandler({ CollegueInvalideException.class })
	public ResponseEntity<String> errorCollegueInvalideException() {

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Le matricule n'existe pas");

	}
	
	@GetMapping(value = "/remuneration_employes")
	public List<RemunerationEmployeDTOGet> afficherRemunerationEmploye(){
		
		List<RemunerationEmployeDTOGet> listeRemunerationEmployeDTOGet = remunerationEmployeService.afficherRemunerationEmployeDTOGet(); 
		
		return listeRemunerationEmployeDTOGet; 
		
	}

}
