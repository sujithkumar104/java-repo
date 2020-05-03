package com.concepts.exception.Custom;

public class TooYoungException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5545332440394466811L;

	TooYoungException(String msg){
		super(msg);
	}
}
