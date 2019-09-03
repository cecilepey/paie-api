package dev.paie.exception;

/**
 * @author Cécile Peyras
 * 
 * Exception qui gère l'invalidité d'un collègue lors de l'utilisation de l'API
 *
 */

public class CollegueInvalideException extends RuntimeException {
	
	/**
	 * Constructeur
	 * 
	 * @param message
	 */
	public CollegueInvalideException(String message) {
		super(message);

	}

	/** Constructeur
	 * 
	 */
	public CollegueInvalideException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public CollegueInvalideException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param arg0
	 * @param arg1
	 */
	public CollegueInvalideException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param arg0
	 */
	public CollegueInvalideException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	

}
