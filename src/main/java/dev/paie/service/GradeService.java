package dev.paie.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.paie.controller.dto.GradeDTO;
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
		
		
		return gradeRepo.findAllWithCodeDTO();
		
		
	}

}
