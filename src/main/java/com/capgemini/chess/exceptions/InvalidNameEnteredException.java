package com.capgemini.chess.exceptions;



public class InvalidNameEnteredException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5546871818857670019L;

	public InvalidNameEnteredException() {
		super("Only letters can be used for name! Check your input and try again.");
		// TODO Auto-generated constructor stub
	}
	
	
	
}
