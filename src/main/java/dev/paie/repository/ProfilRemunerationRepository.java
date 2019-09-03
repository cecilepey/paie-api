package dev.paie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dev.paie.entites.ProfilRemuneration;

public interface ProfilRemunerationRepository extends JpaRepository<ProfilRemuneration, Integer> {

	@Query("select  p from ProfilRemuneration p where p.code = :code")
	ProfilRemuneration findAllWithCode(@Param("code") String code);
	
}
