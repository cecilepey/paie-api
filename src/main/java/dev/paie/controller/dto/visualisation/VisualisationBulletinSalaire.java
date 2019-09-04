/**
 * 
 */
package dev.paie.controller.dto.visualisation;

import dev.paie.controller.dto.PeriodeDTO;
import dev.paie.entites.Entreprise;

/**
 * @author Cécile Peyras
 *
 */
public class VisualisationBulletinSalaire {
	
	private EntrepriseVisualisation entrepriseVisualisation; 
	
	private PeriodeDTO periodeDTO; 
	
	private CollegueVisualisation  collegueVisualisation; 
	
	private CotisationVisualisation cotisationNonImosableVisualisation; 
	
	private CotisationVisualisation cotisationImposableVisualisation; 
	
	private SalaireBrutVisualisation salaireBrutVisualisation;

	
	
	/** Constructeur
	 * 
	 */
	public VisualisationBulletinSalaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param entrepriseVisualisation
	 * @param periodeDTO
	 * @param collegueVisualisation
	 * @param cotisationNonImosableVisualisation
	 * @param cotisationImposableVisualisation
	 * @param salaireBrutVisualisation
	 */
	public VisualisationBulletinSalaire(EntrepriseVisualisation entrepriseVisualisation, PeriodeDTO periodeDTO,
			CollegueVisualisation collegueVisualisation, CotisationVisualisation cotisationNonImosableVisualisation,
			CotisationVisualisation cotisationImposableVisualisation,
			SalaireBrutVisualisation salaireBrutVisualisation) {
		super();
		this.entrepriseVisualisation = entrepriseVisualisation;
		this.periodeDTO = periodeDTO;
		this.collegueVisualisation = collegueVisualisation;
		this.cotisationNonImosableVisualisation = cotisationNonImosableVisualisation;
		this.cotisationImposableVisualisation = cotisationImposableVisualisation;
		this.salaireBrutVisualisation = salaireBrutVisualisation;
	}

	/** Getter
	 * @return the entrepriseVisualisation
	 */
	public EntrepriseVisualisation getEntrepriseVisualisation() {
		return entrepriseVisualisation;
	}

	/** Setter
	 * @param entrepriseVisualisation the entrepriseVisualisation to set
	 */
	public void setEntrepriseVisualisation(EntrepriseVisualisation entrepriseVisualisation) {
		this.entrepriseVisualisation = entrepriseVisualisation;
	}

	/** Getter
	 * @return the periodeDTO
	 */
	public PeriodeDTO getPeriodeDTO() {
		return periodeDTO;
	}

	/** Setter
	 * @param periodeDTO the periodeDTO to set
	 */
	public void setPeriodeDTO(PeriodeDTO periodeDTO) {
		this.periodeDTO = periodeDTO;
	}

	/** Getter
	 * @return the collegueVisualisation
	 */
	public CollegueVisualisation getCollegueVisualisation() {
		return collegueVisualisation;
	}

	/** Setter
	 * @param collegueVisualisation the collegueVisualisation to set
	 */
	public void setCollegueVisualisation(CollegueVisualisation collegueVisualisation) {
		this.collegueVisualisation = collegueVisualisation;
	}

	/** Getter
	 * @return the cotisationNonImosableVisualisation
	 */
	public CotisationVisualisation getCotisationNonImosableVisualisation() {
		return cotisationNonImosableVisualisation;
	}

	/** Setter
	 * @param cotisationNonImosableVisualisation the cotisationNonImosableVisualisation to set
	 */
	public void setCotisationNonImosableVisualisation(CotisationVisualisation cotisationNonImosableVisualisation) {
		this.cotisationNonImosableVisualisation = cotisationNonImosableVisualisation;
	}

	/** Getter
	 * @return the cotisationImposableVisualisation
	 */
	public CotisationVisualisation getCotisationImposableVisualisation() {
		return cotisationImposableVisualisation;
	}

	/** Setter
	 * @param cotisationImposableVisualisation the cotisationImposableVisualisation to set
	 */
	public void setCotisationImposableVisualisation(CotisationVisualisation cotisationImposableVisualisation) {
		this.cotisationImposableVisualisation = cotisationImposableVisualisation;
	}

	/** Getter
	 * @return the salaireBrutVisualisation
	 */
	public SalaireBrutVisualisation getSalaireBrutVisualisation() {
		return salaireBrutVisualisation;
	}

	/** Setter
	 * @param salaireBrutVisualisation the salaireBrutVisualisation to set
	 */
	public void setSalaireBrutVisualisation(SalaireBrutVisualisation salaireBrutVisualisation) {
		this.salaireBrutVisualisation = salaireBrutVisualisation;
	} 
	
	
	
	
	

}
