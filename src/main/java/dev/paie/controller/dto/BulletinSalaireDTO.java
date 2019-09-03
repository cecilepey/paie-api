package dev.paie.controller.dto;

import java.time.ZonedDateTime;

import dev.paie.entites.Periode;

public class BulletinSalaireDTO {

	
	private ZonedDateTime dateHeureCreation; 
	
	private Periode periode;

	/** Getter
	 * @return the dateHeureCreation
	 */
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	/** Setter
	 * @param dateHeureCreation the dateHeureCreation to set
	 */
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

	/** Getter
	 * @return the periode
	 */
	public Periode getPeriode() {
		return periode;
	}

	/** Setter
	 * @param periode the periode to set
	 */
	public void setPeriode(Periode periode) {
		this.periode = periode;
	}
	
	
}
