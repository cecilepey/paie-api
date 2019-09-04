/**
 * 
 */
package dev.paie.controller.dto;

import java.time.ZonedDateTime;

import dev.paie.entites.Grade;

/**
 * @author Cécile Peyras
 *
 */
public class RemunerationEmployeDTOGet {
	
	private ZonedDateTime dateHeureCreation; 
	
	private String matricule;
	
	private Grade grade;

	/** Constructeur
	 * 
	 */
	public RemunerationEmployeDTOGet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param dateHeureCreation
	 * @param matricule
	 * @param grade
	 */
	public RemunerationEmployeDTOGet(String matricule, ZonedDateTime dateHeureCreation, Grade grade) {
		super();
		this.matricule = matricule; 
		this.dateHeureCreation = dateHeureCreation;
		
		this.grade = grade;
	}

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
	 * @return the grade
	 */
	public Grade getGrade() {
		return grade;
	}

	/** Setter
	 * @param grade the grade to set
	 */
	public void setGrade(Grade grade) {
		this.grade = grade;
	}

}
