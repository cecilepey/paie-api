package dev.paie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import dev.paie.controller.dto.ProfilRemunerationDTO;
import dev.paie.entites.ProfilRemuneration;

public interface ProfilRemunerationRepository extends JpaRepository<ProfilRemuneration, Integer> {

	@Query("select  p from ProfilRemuneration p where p.code = :code")
	ProfilRemuneration findProfilWithCode(@Param("code") String code);

	
	
	@Query("select new dev.paie.controller.dto.ProfilRemunerationDTO(p.code) from ProfilRemuneration p")
	List<ProfilRemunerationDTO> findAllWithCodeDTO();
}
