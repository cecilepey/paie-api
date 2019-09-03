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

		RemunerationEmploye remunerationEmploye = new RemunerationEmploye();
		
		Entreprise entreprise = entrepriseRepo.findAllWithCode(remunerationEmployeDTO.getIdEntreprise());
		
		remunerationEmploye.setEntreprise(entreprise);

		
		Grade grade = gradeRepo.findAllWithCode(remunerationEmployeDTO.getIdGrade()); 
		
		remunerationEmploye.setGrade(grade);

		ProfilRemuneration profilRemuneration = profilRemunerationRepo.findAllWithCode(remunerationEmployeDTO.getIdProfilRemuneration()); 
		
		remunerationEmploye.setProfilRemuneration(profilRemuneration);

		remunerationEmploye.setMatricule(remunerationEmployeDTO.getMatricule());

		remunerationEmploye.setDateHeureCreation(ZonedDateTime.now());

		remunerationEmployeRepo.save(remunerationEmploye);

		return remunerationEmploye;

	}

	public void validerMatricule(String matricule) {

		try {
			RestTemplate rt = new RestTemplate();
			Collegue result = rt.getForObject("https://cecile-top-collegue.herokuapp.com/collegues/{id}",
					Collegue.class, matricule);
		} catch (HttpClientErrorException httpClientErrorException) {
			throw new CollegueInvalideException("Ce matricule n'existe pas", httpClientErrorException);
		}

	}

	public List<RemunerationEmployeDTOGet> afficherRemunerationEmployeDTOGet() {

		List<RemunerationEmploye> listeRemunerationEmploye= remunerationEmployeRepo.findAll();

		List<RemunerationEmployeDTOGet> listeRemunerationEmployeDTOGet = new ArrayList<>();

		for (RemunerationEmploye liste : listeRemunerationEmploye) {

			RemunerationEmployeDTOGet remunerationEmployeDTOGet = new RemunerationEmployeDTOGet();

			remunerationEmployeDTOGet.setDateHeureCreation(liste.getDateHeureCreation());		

			remunerationEmployeDTOGet.setGrade(liste.getGrade()); 
			
			remunerationEmployeDTOGet.setMatricule(liste.getMatricule());
				
			listeRemunerationEmployeDTOGet.add(remunerationEmployeDTOGet);

		}

		return listeRemunerationEmployeDTOGet;

	}

	
	public List<RemunerationEmployeMatricule> afficherMatricule(){
		
		List<RemunerationEmploye> listeRemunerationEmploye = remunerationEmployeRepo.findAll(); 
		
		List<RemunerationEmployeMatricule> listeEmployeMatricules = new ArrayList<>(); 
		
		for (RemunerationEmploye remunerationEmploye : listeRemunerationEmploye) {
			
			RemunerationEmployeMatricule remunerationEmployeMatricule = new RemunerationEmployeMatricule();
			
			remunerationEmployeMatricule.setMatricule(remunerationEmploye.getMatricule());
			
			listeEmployeMatricules.add(remunerationEmployeMatricule); 
			
		}
		
		return listeEmployeMatricules; 
		
	}
	
}
