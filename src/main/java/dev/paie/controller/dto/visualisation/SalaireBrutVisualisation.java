package dev.paie.controller.dto.visualisation;

import java.math.BigDecimal;

public class SalaireBrutVisualisation {
	
	private BigDecimal salaireBrut;

	
	
	/** Constructeur
	 * 
	 */
	public SalaireBrutVisualisation() {
		super();
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param salaireBrut
	 */
	public SalaireBrutVisualisation(BigDecimal salaireBrut) {
		super();
		this.salaireBrut = salaireBrut;
	}

	/** Getter
	 * @return the salaireBrut
	 */
	public BigDecimal getSalaireBrut() {
		return salaireBrut;
	}

	/** Setter
	 * @param salaireBrut the salaireBrut to set
	 */
	public void setSalaireBrut(BigDecimal salaireBrut) {
		this.salaireBrut = salaireBrut;
	} 
	
	

}
