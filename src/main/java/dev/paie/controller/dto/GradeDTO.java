package dev.paie.controller.dto;

/**
 * @author Cécile Peyras
 *
 */
public class GradeDTO {
	

	/** code : String */
	private String code;
	

	/** Constructeur
	 * 
	 */
	public GradeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	/** Constructeur
	 * @param code
	 */
	public GradeDTO(String code) {
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
