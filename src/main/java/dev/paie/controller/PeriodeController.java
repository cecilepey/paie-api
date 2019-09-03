/**
 * 
 */
package dev.paie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.paie.controller.dto.PeriodeDTO;
import dev.paie.service.PeriodeService;

/**
 * @author Cécile Peyras
 *
 */
@RestController
public class PeriodeController {
	
	@Autowired
	PeriodeService periodeService; 
	
	@GetMapping(value = "/periodes")
	public List<PeriodeDTO> afficherPeriode(){
		
		List<PeriodeDTO> listePeriodeDTO = periodeService.afficherPeriode(); 
		
		return listePeriodeDTO; 
		
	}

}
