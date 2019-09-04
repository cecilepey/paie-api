package dev.paie.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZonedDateTime;

import dev.paie.entites.Periode;
import dev.paie.entites.RemunerationEmploye;

public class BulletinSalaireDTO {

	
	private ZonedDateTime dateHeureCreation; 
	
	private LocalDate dateDebut;
	
	private LocalDate dateFin; 
	
	private String matricule; 
	
	private BigDecimal salaireBrut; 
	
	private BigDecimal salaireNetImposable; 
	
	private BigDecimal salaireNet;

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
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/** Setter
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/** Getter
	 * @return the salaireBrut
	 */
	public BigDecimal getSalaireBrut() {
		return salaireBrut;
	}

	/** Setter
	 * @param salaireBrut the salaireBrut to set
	 */
	public void setSalaireBrut(BigDecimal salaireBrut) {
		this.salaireBrut = salaireBrut;
	}

	/** Getter
	 * @return the salaireNetAPayer
	 */
	public BigDecimal getSalaireNetImposable() {
		return salaireNetImposable;
	}

	/** Setter
	 * @param salaireNetAPayer the salaireNetAPayer to set
	 */
	public void setSalaireNetImposable(BigDecimal salaireNetAPayer) {
		this.salaireNetImposable = salaireNetAPayer;
	}

	/** Getter
	 * @return the salaireNet
	 */
	public BigDecimal getSalaireNet() {
		return salaireNet;
	}

	/** Setter
	 * @param salaireNet the salaireNet to set
	 */
	public void setSalaireNet(BigDecimal salaireNet) {
		this.salaireNet = salaireNet;
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
