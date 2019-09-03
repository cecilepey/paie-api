/**
 * 
 */
package dev.paie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.paie.controller.dto.PeriodeDTO;
import dev.paie.entites.Periode;
import dev.paie.repository.PeriodeRepository;

/**
 * @author Cécile Peyras
 *
 */
@Service
public class PeriodeService {
	
	@Autowired
	PeriodeRepository periodeRepo; 
	
	public List<PeriodeDTO> afficherPeriode(){
		
		List<PeriodeDTO> listePeriodeDTO = new ArrayList<>(); 
		
		List<Periode> listePeriode = periodeRepo.findAll(); 
		
		for (Periode periode : listePeriode) {
			
			PeriodeDTO periodeDTO = new PeriodeDTO(); 
			
			periodeDTO.setDateDebut(periode.getDateDebut());
			periodeDTO.setDateFin(periode.getDateFin());
			
			listePeriodeDTO.add(periodeDTO); 
			
		}
		
		return listePeriodeDTO; 
		
		
	}

}
