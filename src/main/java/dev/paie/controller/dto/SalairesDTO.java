package dev.paie.controller.dto;

import java.math.BigDecimal;

public class SalairesDTO {
	
	private BigDecimal salaireBrut; 
	
	private BigDecimal salaireNetImposable; 
	
	private BigDecimal salaireNet;

	/** Constructeur
	 * 
	 */
	public SalairesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param salaireBrut
	 * @param salaireNetImposable
	 * @param salaireNet
	 */
	public SalairesDTO(BigDecimal salaireBrut, BigDecimal salaireNetImposable, BigDecimal salaireNet) {
		super();
		this.salaireBrut = salaireBrut;
		this.salaireNetImposable = salaireNetImposable;
		this.salaireNet = salaireNet;
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

	/** Getter
	 * @return the salaireNetImposable
	 */
	public BigDecimal getSalaireNetImposable() {
		return salaireNetImposable;
	}

	/** Setter
	 * @param salaireNetImposable the salaireNetImposable to set
	 */
	public void setSalaireNetImposable(BigDecimal salaireNetImposable) {
		this.salaireNetImposable = salaireNetImposable;
	}

	/** Getter
	 * @return the salaireNet
	 */
	public BigDecimal getSalaireNet() {
		return salaireNet;
	}

	/** Setter
	 * @param salaireNet the salaireNet to set
	 */
	public void setSalaireNet(BigDecimal salaireNet) {
		this.salaireNet = salaireNet;
	} 

}
