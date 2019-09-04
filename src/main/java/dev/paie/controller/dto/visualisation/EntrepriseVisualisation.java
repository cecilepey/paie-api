package dev.paie.controller.dto.visualisation;

public class EntrepriseVisualisation {

	
	private String denomination; 
	private String siret;
	
	
	
	
	/** Constructeur
	 * 
	 */
	public EntrepriseVisualisation() {
		super();
		// TODO Auto-generated constructor stub
	}
	/** Constructeur
	 * @param denomination
	 * @param siret
	 */
	public EntrepriseVisualisation(String denomination, String siret) {
		super();
		this.denomination = denomination;
		this.siret = siret;
	}
	/** Getter
	 * @return the denomination
	 */
	public String getDenomination() {
		return denomination;
	}
	/** Setter
	 * @param denomination the denomination to set
	 */
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	/** Getter
	 * @return the siret
	 */
	public String getSiret() {
		return siret;
	}
	/** Setter
	 * @param siret the siret to set
	 */
	public void setSiret(String siret) {
		this.siret = siret;
	} 
	
	
	
	
}
