package com.ty.traveller_app.exception;

public class IdDoesNotFoundException extends RuntimeException{

	private String message = "Id Does Not Exist";

	public IdDoesNotFoundException() {

	}

	public IdDoesNotFoundException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "IdDoesNotFoundException [message=" + message + "]";
	}

}
