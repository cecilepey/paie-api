/**
 * 
 */
package dev.paie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dev.paie.controller.dto.GradeDTO;
import dev.paie.entites.Grade;


/**
 * @author Cécile Peyras
 *
 */
public interface GradeRepository extends JpaRepository<Grade, Integer>{
	
	@Query("select new dev.paie.controller.dto.GradeDTO (g.code) from Grade g")
	List<GradeDTO> findAllWithCodeDTO();
	
	
	@Query("select  g from Grade g where g.code = :code")
	Grade findAllWithCode(@Param("code") String code);

}
