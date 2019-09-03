/**
 * 
 */
package dev.paie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.paie.controller.dto.GradeDTO;
import dev.paie.service.GradeService;

/**
 * @author Cécile Peyras
 *
 */
@RestController
public class GradeController {
	
	@Autowired
	GradeService gradeService; 
	
	@GetMapping (value  = "/grades")
	public List<GradeDTO> afficherGrade(){
		
		List<GradeDTO> listeGrade = gradeService.afficherCode();
		
		return listeGrade; 
		
	}

}
