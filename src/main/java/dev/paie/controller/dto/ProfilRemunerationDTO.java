package dev.paie.controller.dto;

public class ProfilRemunerationDTO {


	private String code;
	

	/** Constructeur
	 * 
	 */
	public ProfilRemunerationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	/** Constructeur
	 * @param code
	 */
	public ProfilRemunerationDTO(String code) {
		super();
		this.code = code;
	}
	/** Getter
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/** Setter
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	
	
}
