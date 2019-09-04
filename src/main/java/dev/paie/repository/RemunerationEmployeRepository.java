/**
 * 
 */
package dev.paie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dev.paie.controller.dto.RemunerationEmployeDTOGet;
import dev.paie.controller.dto.RemunerationEmployeMatricule;

import dev.paie.entites.RemunerationEmploye;

/**
 * @author Cécile Peyras
 *
 */
public interface RemunerationEmployeRepository extends JpaRepository<RemunerationEmploye, Integer> {
	
	@Query("select new dev.paie.controller.dto.RemunerationEmployeDTOGet(r.matricule, r.DateHeureCreation, r.grade) from RemunerationEmploye r")
	List<RemunerationEmployeDTOGet> findAllWithDateMaticulGrade();
	
	
	
	@Query("select new dev.paie.controller.dto.RemunerationEmployeMatricule(r.matricule) from RemunerationEmploye r")
	List<RemunerationEmployeMatricule> findAllWithMaticule();
	
	@Query("select  r from RemunerationEmploye r where r.matricule = :matricule")
	RemunerationEmploye findPeriodeByMatricule(@Param("matricule") String matricule);

}
