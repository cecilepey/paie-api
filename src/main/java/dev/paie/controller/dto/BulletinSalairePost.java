package dev.paie.controller.dto;


import javax.validation.constraints.NotBlank;


public class BulletinSalairePost {
	
	@NotBlank
	private String matricule; 
	@NotBlank
	private String dateDebut;
	@NotBlank
	private String dateFin; 
	@NotBlank
	private String primeExceptionnelle;

	/** Getter
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/** Constructeur
	 * 
	 */
	public BulletinSalairePost() {
		super();
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param matricule
	 * @param dateDebut
	 * @param dateFin
	 * @param primeExceptionnelle
	 */
	public BulletinSalairePost(@NotBlank String matricule,@NotBlank String dateDebut,@NotBlank String dateFin,@NotBlank
			String primeExceptionnelle) {
		super();
		this.matricule = matricule;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.primeExceptionnelle = primeExceptionnelle;
	}

	/** Setter
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/** Getter
	 * @return the dateDebut
	 */
	public String getDateDebut() {
		return dateDebut;
	}

	/** Setter
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	/** Getter
	 * @return the dateFin
	 */
	public String getDateFin() {
		return dateFin;
	}

	/** Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	/** Getter
	 * @return the primeExceptionnelle
	 */
	public String getPrimeExceptionnelle() {
		return primeExceptionnelle;
	}

	/** Setter
	 * @param primeExceptionnelle the primeExceptionnelle to set
	 */
	public void setPrimeExceptionnelle(String primeExceptionnelle) {
		this.primeExceptionnelle = primeExceptionnelle;
	}



}
