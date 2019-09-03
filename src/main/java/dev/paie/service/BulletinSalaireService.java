package dev.paie.service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.paie.controller.dto.BulletinSalaireDTO;
import dev.paie.controller.dto.BulletinSalairePost;
import dev.paie.entites.BulletinSalaire;
import dev.paie.entites.Periode;
import dev.paie.entites.RemunerationEmploye;
import dev.paie.repository.BulletinSalaireRepository;
import dev.paie.repository.PeriodeRepository;
import dev.paie.repository.RemunerationEmployeRepository;

/**
 * @author Cécile Peyras
 *
 */
@Service
public class BulletinSalaireService {

	
	@Autowired
	BulletinSalaireRepository bulletinSalaireRepo; 
	
	@Autowired
	RemunerationEmployeRepository remunerationEmployeRepo; 
	
	@Autowired
	PeriodeRepository periodeRepo; 
	
	public List<BulletinSalaireDTO> afficherBulletinSalaireDTO(){
		
		List<BulletinSalaire> listeBulletinSalaire = bulletinSalaireRepo.findAll(); 
		
		List<BulletinSalaireDTO> listeBulletinSalaireDTO = new ArrayList<>(); 
		
		for (BulletinSalaire bulletinSalaire : listeBulletinSalaire) {
			
			BulletinSalaireDTO bulletinSalaireDTO = new BulletinSalaireDTO(); 
			
			bulletinSalaireDTO.setDateHeureCreation(bulletinSalaire.getDateHeureCreation());
			
			bulletinSalaireDTO.setPeriode(bulletinSalaire.getPeriode());
			
			listeBulletinSalaireDTO.add(bulletinSalaireDTO); 
			
		}
		
		return listeBulletinSalaireDTO; 
		
	}
	
	
	public BulletinSalaire transformerBulletinSalairePost(BulletinSalairePost bulletinSalairePost) {
		BulletinSalaire bulletinSalaire = new BulletinSalaire(); 
		
		List<Periode> listePeriode = periodeRepo.findAll();
		for (Periode periode : listePeriode) {
			if(bulletinSalairePost.getPeriode().equals(periode.getDateDebut())){
				bulletinSalaire.setPeriode(periode);
			}
		}
		
		List<RemunerationEmploye> listeRemunerationEmploye = remunerationEmployeRepo.findAll(); 
		
		for (RemunerationEmploye remunerationEmploye : listeRemunerationEmploye) {
			if(bulletinSalairePost.getMatricule().equals(remunerationEmploye.getMatricule())) {
				bulletinSalaire.setRemunerationEmploye(remunerationEmploye);
			}
		}
			
		
		bulletinSalaire.setPrimeExceptionnelle(bulletinSalairePost.getPrime());
		
		bulletinSalaire.setDateHeureCreation(ZonedDateTime.now());
		
		bulletinSalaireRepo.save(bulletinSalaire); 
				
		return bulletinSalaire; 
		
		
	}
}
