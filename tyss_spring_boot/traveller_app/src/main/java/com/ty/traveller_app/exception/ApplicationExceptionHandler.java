package com.ty.traveller_app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ty.traveller_app.dto.ResponseStructure;

@RestControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

	public ResponseEntity<ResponseStructure<String>> catchIdDoesNotExistException(IdDoesNotFoundException exception) {
		ResponseStructure<String> responseStructure = new ResponseStructure<String>();
		responseStructure.setMessage("Not Found");
		responseStructure.setData(exception.getMessage());
		responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());

		return new ResponseEntity<ResponseStructure<String>>(responseStructure, HttpStatus.NOT_FOUND);
	}
}
