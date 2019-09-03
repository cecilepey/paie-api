/**
 * 
 */
package dev.paie.controller.dto;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Cécile Peyras
 *
 */
public class RemunerationEmployeDTOPost {

	@NotBlank
	private String matricule; 
	@NotBlank
	private String idEntreprise; 
	@NotBlank
	private String idGrade; 
	@NotBlank
	private String idProfilRemuneration;
	
	
	
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
	 * @return the idEntreprise
	 */
	public String getIdEntreprise() {
		return idEntreprise;
	}
	/** Setter
	 * @param idEntreprise the idEntreprise to set
	 */
	public void setIdEntreprise(String idEntreprise) {
		this.idEntreprise = idEntreprise;
	}
	/** Getter
	 * @return the idGrade
	 */
	public String getIdGrade() {
		return idGrade;
	}
	/** Setter
	 * @param idGrade the idGrade to set
	 */
	public void setIdGrade(String idGrade) {
		this.idGrade = idGrade;
	}
	/** Getter
	 * @return the idProfilRemuneration
	 */
	public String getIdProfilRemuneration() {
		return idProfilRemuneration;
	}
	/** Setter
	 * @param idProfilRemuneration the idProfilRemuneration to set
	 */
	public void setIdProfilRemuneration(String idProfilRemuneration) {
		this.idProfilRemuneration = idProfilRemuneration;
	}
	
	
	
	
}
