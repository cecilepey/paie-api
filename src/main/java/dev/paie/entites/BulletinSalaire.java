package dev.paie.entites;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class BulletinSalaire {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn (name = "remuneration_employe_id")
	private RemunerationEmploye remunerationEmploye;
	@ManyToOne
	@JoinColumn (name = "periode_id")
	private Periode periode;
	private BigDecimal primeExceptionnelle;
	
	private ZonedDateTime dateHeureCreation; 
	
	public RemunerationEmploye getRemunerationEmploye() {
		return remunerationEmploye;
	}
	public void setRemunerationEmploye(RemunerationEmploye remunerationEmploye) {
		this.remunerationEmploye = remunerationEmploye;
	}
	public Periode getPeriode() {
		return periode;
	}
	public void setPeriode(Periode periode) {
		this.periode = periode;
	}
	public BigDecimal getPrimeExceptionnelle() {
		return primeExceptionnelle;
	}
	public void setPrimeExceptionnelle(BigDecimal primeExceptionnelle) {
		this.primeExceptionnelle = primeExceptionnelle;
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
		return dateHeureCreation;
	}
	/** Setter
	 * @param dateHeureCreation the dateHeureCreation to set
	 */
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}
	
	
	
}
