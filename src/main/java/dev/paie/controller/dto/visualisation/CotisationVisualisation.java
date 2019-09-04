package dev.paie.controller.dto.visualisation;

import java.math.BigDecimal;


public class CotisationVisualisation {
	
	private String rubriques; 
	
	private BigDecimal tauxSalarial;
	
	private BigDecimal montantSalarial;
	
	private BigDecimal tauxPatronal;
	
	private BigDecimal cotisationPatronale; 
	
	
	
	/** Constructeur
	 * 
	 */
	public CotisationVisualisation() {
		super();
		// TODO Auto-generated constructor stub
	}






	/** Constructeur
	 * @param rubriques
	 * @param tauxSalarial
	 * @param montantSalarial
	 * @param tauxPatronal
	 * @param cotisationPatronale
	 */
	public CotisationVisualisation(String rubriques, BigDecimal tauxSalarial, BigDecimal montantSalarial,
			BigDecimal tauxPatronal, BigDecimal cotisationPatronale) {
		super();
		this.rubriques = rubriques;
		this.tauxSalarial = tauxSalarial;
		this.montantSalarial = montantSalarial;
		this.tauxPatronal = tauxPatronal;
		this.cotisationPatronale = cotisationPatronale;
	}






	/** Getter
	 * @return the rubriques
	 */
	public String getRubriques() {
		return rubriques;
	}






	/** Setter
	 * @param rubriques the rubriques to set
	 */
	public void setRubriques(String rubriques) {
		this.rubriques = rubriques;
	}






	/** Getter
	 * @return the tauxSalarial
	 */
	public BigDecimal getTauxSalarial() {
		return tauxSalarial;
	}






	/** Setter
	 * @param tauxSalarial the tauxSalarial to set
	 */
	public void setTauxSalarial(BigDecimal tauxSalarial) {
		this.tauxSalarial = tauxSalarial;
	}






	/** Getter
	 * @return the montantSalarial
	 */
	public BigDecimal getMontantSalarial() {
		return montantSalarial;
	}






	/** Setter
	 * @param montantSalarial the montantSalarial to set
	 */
	public void setMontantSalarial(BigDecimal montantSalarial) {
		this.montantSalarial = montantSalarial;
	}






	/** Getter
	 * @return the tauxPatronal
	 */
	public BigDecimal getTauxPatronal() {
		return tauxPatronal;
	}






	/** Setter
	 * @param tauxPatronal the tauxPatronal to set
	 */
	public void setTauxPatronal(BigDecimal tauxPatronal) {
		this.tauxPatronal = tauxPatronal;
	}






	/** Getter
	 * @return the cotisationPatronale
	 */
	public BigDecimal getCotisationPatronale() {
		return cotisationPatronale;
	}






	/** Setter
	 * @param cotisationPatronale the cotisationPatronale to set
	 */
	public void setCotisationPatronale(BigDecimal cotisationPatronale) {
		this.cotisationPatronale = cotisationPatronale;
	}



	

}
