/**
 * 
 */
package dev.paie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.paie.entites.Grade;


/**
 * @author Cécile Peyras
 *
 */
public interface GradeRepository extends JpaRepository<Grade, String>{
	
	

}
