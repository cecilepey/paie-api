package dev.paie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.paie.controller.dto.GradeDTO;
import dev.paie.entites.Grade;
import dev.paie.repository.GradeRepository;

/**
 * @author Cécile Peyras
 *
 */
@Service
public class GradeService {
	
	@Autowired
	GradeRepository gradeRepo; 
	
	public List<GradeDTO> afficherCode(){
		
		List<Grade> listeGrade = gradeRepo.findAll(); 
		
		List<GradeDTO> listeGradeDTO = new ArrayList<GradeDTO>(); 
		
		
		for (Grade liste : listeGrade) {
			
			GradeDTO gradeDTO = new GradeDTO(); 
			
			gradeDTO.setCode(liste.getCode());
			
			listeGradeDTO.add(gradeDTO); 
			
		}
		
		
		return listeGradeDTO;
		
		
	}

}
