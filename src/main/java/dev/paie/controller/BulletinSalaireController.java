package dev.paie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.paie.controller.dto.BulletinSalaireDTO;
import dev.paie.controller.dto.BulletinSalairePost;
import dev.paie.entites.BulletinSalaire;
import dev.paie.service.BulletinSalaireService;

/**
 * @author Cécile Peyras
 *
 */
@RestController
public class BulletinSalaireController {
	
	@Autowired
	BulletinSalaireService bulletinSalaireService; 
	
	@GetMapping (value = "/bulletins_salaire")
	public List<BulletinSalaireDTO> afficherBulletin()
	{
		
		List<BulletinSalaireDTO> listeBulletinDTO = bulletinSalaireService.afficherBulletinSalaireDTO(); 
		
		return listeBulletinDTO; 
	}
	
	@PostMapping (value = "/bulletins_salaire" )
	public BulletinSalaire ajouterBulletin (@RequestBody BulletinSalairePost bulletinSalairePost) {
		
		BulletinSalaire bulletinSalaire = bulletinSalaireService.transformerBulletinSalairePost(bulletinSalairePost); 
		
		return bulletinSalaire; 
		
	}
}
