package dev.paie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dev.paie.controller.dto.BulletinSalaireDTO;

import dev.paie.entites.BulletinSalaire;


public interface BulletinSalaireRepository extends JpaRepository<BulletinSalaire, String>  {
	
//	@Query("select new dev.paie.controller.dto.BulletinSalaireDTO( b.dateHeureCreation, b.dateDebut) from BulletinSalaire b")
//	List<BulletinSalaireDTO> findAllWithAllInfo();
	

	
}
