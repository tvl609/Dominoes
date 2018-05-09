package model.exceptions;

/**
 * 
 * @author Shane Bogard
 *
 */

@SuppressWarnings("serial")
public class NoSuchDominoException extends Exception {	
	
	/**
	* Constructs an Duplicate Domino message.
	* @param message A string literal displaying an duplicate domino exception
	*/
	public NoSuchDominoException(String message){
		super(message);
	}
	
	public NoSuchDominoException() {
		this("No such domino exists");
	}
	
}
