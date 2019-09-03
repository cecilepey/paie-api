package dev.paie.entites;


import java.time.ZonedDateTime;

import javax.persistence.*;

@Entity
public class RemunerationEmploye {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String matricule;
	@ManyToOne
	@JoinColumn(name = "entreprise_id")
	private Entreprise entreprise;
	@ManyToOne
	@JoinColumn(name = "profil_remuneration_id")
	private ProfilRemuneration profilRemuneration;
	@OneToOne
	private Grade grade;
	
	private ZonedDateTime DateHeureCreation; 
	
	@PrePersist
	public void onPersist() {
		this.DateHeureCreation = ZonedDateTime.now();
	}
	
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	public ProfilRemuneration getProfilRemuneration() {
		return profilRemuneration;
	}
	public void setProfilRemuneration(ProfilRemuneration profilRemuneration) {
		this.profilRemuneration = profilRemuneration;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	/** Getter
	 * @return the dateHeureCreation
	 */
	public ZonedDateTime getDateHeureCreation() {
		return DateHeureCreation;
	}
	/** Setter
	 * @param dateHeureCreation the dateHeureCreation to set
	 */
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		DateHeureCreation = dateHeureCreation;
	}
}
