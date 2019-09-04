package dev.paie.controller.dto.visualisation;

import java.time.LocalDate;

public class CollegueVisualisation {
	
	private String matricule; 
	
	private String nom; 
	
	private String prenoms; 
	
	private LocalDate dateDeNaissance;

	
	
	/** Constructeur
	 * 
	 */
	public CollegueVisualisation() {
		super();
		// TODO Auto-generated constructor stub
	}



	/** Constructeur
	 * @param matricule
	 * @param nom
	 * @param prenoms
	 * @param dateDeNaissance
	 */
	public CollegueVisualisation(String matricule, String nom, String prenoms, LocalDate dateDeNaissance) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenoms = prenoms;
		this.dateDeNaissance = dateDeNaissance;
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}



	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}



	/** Getter
	 * @return the prenoms
	 */
	public String getPrenoms() {
		return prenoms;
	}



	/** Setter
	 * @param prenoms the prenoms to set
	 */
	public void setPrenoms(String prenoms) {
		this.prenoms = prenoms;
	}



	/** Getter
	 * @return the dateDeNaissance
	 */
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}



	/** Setter
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	} 
	
	

}
