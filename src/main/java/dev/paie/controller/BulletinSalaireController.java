package dev.paie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping(value = "/bulletins_salaire")
public class BulletinSalaireController {
	
	@Autowired
	BulletinSalaireService bulletinSalaireService; 
	
	@GetMapping 
	public List<BulletinSalaireDTO> afficherBulletin()
	{
		
		List<BulletinSalaireDTO> listeBulletinDTO = bulletinSalaireService.afficherBulletinSalaireDTO(); 
		
		return listeBulletinDTO; 
	}
	
	@PostMapping 
	public BulletinSalaireDTO ajouterBulletin (@RequestBody BulletinSalairePost bulletinSalairePost) {
		
		BulletinSalaireDTO bulletinSalaireDTO = bulletinSalaireService.creerBulletinSalaire(bulletinSalairePost); 
		
		return bulletinSalaireDTO; 
		
	}
}
