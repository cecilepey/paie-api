package dev.paie.entites.collegueAPI;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Cécile Peyras
 * Classe qui gère les collègues
 */

public class Collegue {

	/** id : Integer */
	private Integer id; 
	
	/** matricule : String */
	private String matricule; 
	
	/** nom : String */
	private String nom; 
	
	/** prenoms : String */
	private String prenoms; 
	
	/** email : String */
	private String email; 
	
	/** dateDeNaissance : LocalDate */
	private LocalDate dateDeNaissance; 
	
	/** photoUrl : String */
	private String photoUrl;

	

	/** Constructeur
	 * 
	 */
	public Collegue() {
		
	}
	
	

	/** Constructeur
	 * @param matricule
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param dateDeNaissance
	 * @param photoUrl
	 */
	public Collegue(String matricule, String nom, String prenoms, String email, LocalDate dateDeNaissance,
			String photoUrl) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenoms = prenoms;
		this.email = email;
		this.dateDeNaissance = dateDeNaissance;
		this.photoUrl = photoUrl;
	}



	/** Constructeur
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param dateDeNaissance
	 * @param photoUrl
	 */
	public Collegue(String nom, String prenoms, String email, LocalDate dateDeNaissance, String photoUrl) {
		super();
		this.nom = nom;
		this.prenoms = prenoms;
		this.email = email;
		this.dateDeNaissance = dateDeNaissance;
		this.photoUrl = photoUrl;
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
	 * @return the prenom
	 */
	public String getPrenoms() {
		return prenoms;
	}

	/** Setter
	 * @param prenom the prenom to set
	 */
	public void setPrenoms(String prenoms) {
		this.prenoms = prenoms;
	}

	/** Getter
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/** Setter
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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

	/** Getter
	 * @return the photoUrl
	 */
	public String getPhotoUrl() {
		return photoUrl;
	}

	/** Setter
	 * @param photoUrl the photoUrl to set
	 */
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}



	/** Getter
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}



	/** Setter
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	} 
	
	
	
}
