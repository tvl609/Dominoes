package model.exceptions;

/**
 * 
 * @author Shane Bogard
 *
 */

@SuppressWarnings("serial")
public class DuplicateDominoException extends Exception {	
	
	/**
	* Constructs an Duplicate Domino message.
	* @param message A string literal displaying an duplicate domino exception
	*/
	public DuplicateDominoException(String message){
		super(message);
	}
	
	public DuplicateDominoException() {
		this("Domino already exists");
	}
	
}
