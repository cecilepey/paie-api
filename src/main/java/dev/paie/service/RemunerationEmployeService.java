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

	public RemunerationEmploye transformerDTO(RemunerationEmployeDTOPost remunerationEmployeDTO) {

		RemunerationEmploye remunerationEmploye = new RemunerationEmploye();

		List<Entreprise> listeEntreprise = entrepriseRepo.findAll();

		for (Entreprise entreprise : listeEntreprise) {
			if (entreprise.getCode().equals(remunerationEmployeDTO.getIdEntreprise())) {
				remunerationEmploye.setEntreprise(entreprise);
			}
		}

		List<Grade> listeGrade = gradeRepo.findAll();

		for (Grade grade : listeGrade) {
			if (grade.getCode().equals(remunerationEmployeDTO.getIdGrade())) {
				remunerationEmploye.setGrade(grade);
			}
		}

		List<ProfilRemuneration> listeProfilRemuneration = profilRemunerationRepo.findAll();

		for (ProfilRemuneration profilRemuneration : listeProfilRemuneration) {
			if (profilRemuneration.getCode().equals(remunerationEmployeDTO.getIdProfilRemuneration())) {
				remunerationEmploye.setProfilRemuneration(profilRemuneration);
			}
		}

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
			throw new CollegueInvalideException("Ce matricule n'existe pas");
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

}
