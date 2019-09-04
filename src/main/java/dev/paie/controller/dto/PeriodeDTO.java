/**
 * 
 */
package dev.paie.controller.dto;

import java.time.LocalDate;

/**
 * @author Cécile Peyras
 *
 */
public class PeriodeDTO {
	
	private LocalDate dateDebut;
	private LocalDate dateFin;
	
	
	
	/** Constructeur
	 * 
	 */
	public PeriodeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	/** Constructeur
	 * @param dateDebut
	 * @param dateFin
	 */
	public PeriodeDTO(LocalDate dateDebut, LocalDate dateFin) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	/** Getter
	 * @return the dateDebut
	 */
	public LocalDate getDateDebut() {
		return dateDebut;
	}
	/** Setter
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}
	/** Getter
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}
	/** Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}
	
	

}
