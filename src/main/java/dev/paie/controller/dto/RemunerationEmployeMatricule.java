package dev.paie.controller.dto;

public class RemunerationEmployeMatricule {
	
	private String matricule;

	/** Getter
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/** Constructeur
	 * 
	 */
	public RemunerationEmployeMatricule() {
		super();
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param matricule
	 */
	public RemunerationEmployeMatricule(String matricule) {
		super();
		this.matricule = matricule;
	}

	/** Setter
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	

}
