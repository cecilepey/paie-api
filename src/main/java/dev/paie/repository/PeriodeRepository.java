package dev.paie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dev.paie.controller.dto.PeriodeDTO;
import dev.paie.entites.Periode;


public interface PeriodeRepository extends JpaRepository<Periode, Integer>{

	
//	@Query("select  p from Periode p where p.dateDebut = :dateDebut and p.dateFin")
//	PeriodeDTO findAllWithDateDebut(@Param("dateDebut") LocalDate dateDebut, @Param("dateFin") LocalDate dateFin);
	
	@Query("select new dev.paie.controller.dto.PeriodeDTO(p.dateDebut, p.dateFin) from Periode p")
	List<PeriodeDTO> findAllWithoutId();
	
}
