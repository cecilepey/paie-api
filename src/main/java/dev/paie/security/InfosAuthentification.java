package dev.paie.security;


public class InfosAuthentification {
	
	private String email; 
	
	private String motDePasse;
	
	

	/** Constructeur
	 * 
	 */
	public InfosAuthentification() {
		super();
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param email
	 * @param motDePasse
	 */
	public InfosAuthentification(String email, String motDePasse) {
		super();
		this.email = email;
		this.motDePasse = motDePasse;
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
	 * @return the motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}

	/** Setter
	 * @param motDePasse the motDePasse to set
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	} 
	
	
	
	

}
