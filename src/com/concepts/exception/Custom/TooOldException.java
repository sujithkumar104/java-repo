package com.concepts.exception.Custom;

public class TooOldException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1934482672156564548L;

	TooOldException(String msg){
		super(msg);
	}
	
}
