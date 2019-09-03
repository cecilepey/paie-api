/**
 * 
 */
package dev.paie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.paie.entites.RemunerationEmploye;

/**
 * @author Cécile Peyras
 *
 */
public interface RemunerationEmployeRepository extends JpaRepository<RemunerationEmploye, String> {

}
