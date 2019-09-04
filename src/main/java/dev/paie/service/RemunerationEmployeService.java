/**
 * 
 */
package dev.paie.service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.type.ZonedDateTimeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import dev.paie.controller.dto.GradeDTO;
import dev.paie.controller.dto.RemunerationEmployeDTOGet;
import dev.paie.controller.dto.RemunerationEmployeDTOPost;
import dev.paie.controller.dto.RemunerationEmployeMatricule;
import dev.paie.entites.Entreprise;
import dev.paie.entites.Grade;
import dev.paie.entites.ProfilRemuneration;
import dev.paie.entites.RemunerationEmploye;
import dev.paie.entites.collegueAPI.Collegue;
import dev.paie.exception.CollegueInvalideException;
import dev.paie.repository.EntrepriseRepository;
import dev.paie.repository.GradeRepository;
import dev.paie.repository.ProfilRemunerationRepository;
import dev.paie.repository.RemunerationEmployeRepository;

/**
 * @author Cécile Peyras
 *
 */
@Service
public class RemunerationEmployeService {

	@Autowired
	EntrepriseRepository entrepriseRepo;

	@Autowired
	GradeRepository gradeRepo;

	@Autowired
	ProfilRemunerationRepository profilRemunerationRepo;

	@Autowired
	RemunerationEmployeRepository remunerationEmployeRepo;

	public RemunerationEmploye creerRemunerationEmploye(RemunerationEmployeDTOPost remunerationEmployeDTO) {
		
		//Validation du matricule
		String matricule = remunerationEmployeDTO.getMatricule(); 
		
		try {
			RestTemplate rt = new RestTemplate();
			Collegue result = rt.getForObject("https://cecile-top-collegue.herokuapp.com/collegues/{id}",
					Collegue.class, matricule);
		} catch (HttpClientErrorException httpClientErrorException) {
			throw new CollegueInvalideException("Ce matricule n'existe pas", httpClientErrorException);
		}

		//Création de l'objet remunerationEmploye
		RemunerationEmploye remunerationEmploye = new RemunerationEmploye();
			
		Entreprise entreprise = entrepriseRepo.findEntrepriseWithCode(remunerationEmployeDTO.getCodeEntreprise()); 
		
		remunerationEmploye.setEntreprise(entreprise);

		Grade grade = gradeRepo.findGradeWithCode(remunerationEmployeDTO.getCodeGrade()); 
		
		remunerationEmploye.setGrade(grade);

		ProfilRemuneration profilRemuneration = profilRemunerationRepo.findProfilWithCode(remunerationEmployeDTO.getCodeProfilRemuneration()); 
		
		remunerationEmploye.setProfilRemuneration(profilRemuneration);

		remunerationEmploye.setMatricule(matricule);

		remunerationEmploye.setDateHeureCreation(ZonedDateTime.now());

		remunerationEmployeRepo.save(remunerationEmploye);

		return remunerationEmploye;

	}


	public List<RemunerationEmployeDTOGet> afficherRemunerationEmployeDTOGet() {
	
		return remunerationEmployeRepo.findAllWithDateMaticulGrade(); 

	}

	
	public List<RemunerationEmployeMatricule> afficherMatricule(){
		
		return remunerationEmployeRepo.findAllWithMaticule(); 
		
		
	}
	
}
