/**
 * 
 */
package dev.paie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dev.paie.controller.dto.RemunerationEmployeDTOGet;
import dev.paie.entites.RemunerationEmploye;

/**
 * @author Cécile Peyras
 *
 */
public interface RemunerationEmployeRepository extends JpaRepository<RemunerationEmploye, Integer> {
	
	@Query("select new dev.paie.controller.dto.RemunerationEmployeDTOGet(r.DateHeureCreation, r.grade) from RemunerationEmploye r")
	List<RemunerationEmployeDTOGet> findAllWithDateMaticulGrade();

}
