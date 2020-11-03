package com.ssa.exceptions;

@SuppressWarnings("serial")
public class RecordNotFoundException extends RuntimeException {
    
	public RecordNotFoundException(String msg) {
		
		super(msg);
		
	}
}
