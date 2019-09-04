package dev.paie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dev.paie.controller.dto.EntrepriseDTO;
import dev.paie.entites.Entreprise;



public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {
	
	@Query("select new dev.paie.controller.dto.EntrepriseDTO(e.code, e.denomination) from Entreprise e")
	List<EntrepriseDTO> findAllWithCodeDenomination();
	
	@Query("select e from Entreprise e where e.code = :code")
	Entreprise findEntrepriseWithCode(@Param("code") String code);

}
