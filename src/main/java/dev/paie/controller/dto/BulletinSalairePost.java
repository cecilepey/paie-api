package dev.paie.controller.dto;


import java.math.BigDecimal;

import dev.paie.entites.Periode;

public class BulletinSalairePost {
	
	
	private String matricule; 
	
	private Periode periode;
	
	private BigDecimal prime;



	/** Getter
	 * @return the periode
	 */
	public Periode getPeriode() {
		return periode;
	}

	/** Setter
	 * @param periode the periode to set
	 */
	public void setPeriode(Periode periode) {
		this.periode = periode;
	}

	/** Getter
	 * @return the prime
	 */
	public BigDecimal getPrime() {
		return prime;
	}

	/** Setter
	 * @param prime the prime to set
	 */
	public void setPrime(BigDecimal prime) {
		this.prime = prime;
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

}
