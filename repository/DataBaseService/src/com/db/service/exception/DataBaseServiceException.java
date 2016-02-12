package com.db.service.exception;

public class DataBaseServiceException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public DataBaseServiceException(){
		super();
	}
	
	public DataBaseServiceException(Throwable cause){
		super(cause);
	}
	
	public DataBaseServiceException(String message) {
		super(message);
	}
	
	public DataBaseServiceException(String message, Throwable cause) {
		super(message, cause);
	}
}
