/**
 * 
 */
package dev.paie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dev.paie.entites.Grade;


/**
 * @author Cécile Peyras
 *
 */
public interface GradeRepository extends JpaRepository<Grade, Integer>{
	
	@Query("select  g from Grade g where g.code = :code")
	Grade findAllWithCode(@Param("code") String code);

}
