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
	private String codeEntreprise; 
	@NotBlank
	private String codeGrade; 
	@NotBlank
	private String codeProfilRemuneration;
	
	
	

	/** Constructeur
	 * 
	 */
	public RemunerationEmployeDTOPost() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the idEntreprise
	 */
	public String getCodeEntreprise() {
		return codeEntreprise;
	}
	/** Setter
	 * @param idEntreprise the idEntreprise to set
	 */
	public void setCodeEntreprise(String idEntreprise) {
		this.codeEntreprise = idEntreprise;
	}
	/** Getter
	 * @return the idGrade
	 */
	public String getCodeGrade() {
		return codeGrade;
	}
	/** Setter
	 * @param idGrade the idGrade to set
	 */
	public void setCodeGrade(String idGrade) {
		this.codeGrade = idGrade;
	}
	/** Getter
	 * @return the idProfilRemuneration
	 */
	public String getCodeProfilRemuneration() {
		return codeProfilRemuneration;
	}
	/** Setter
	 * @param idProfilRemuneration the idProfilRemuneration to set
	 */
	public void setCodeProfilRemuneration(String idProfilRemuneration) {
		this.codeProfilRemuneration = idProfilRemuneration;
	}
	
	
	
	
}
