package com.ssa.exceptions;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ssa.config.AppPropertiesConfig;
import com.ssa.constants.SSNAppConstants;

@RestController
@RestControllerAdvice
public class RestExceptionHandler {
	
	@Autowired
	private AppPropertiesConfig appProps;
	@ExceptionHandler(value=RecordNotFoundException.class)
	public ResponseEntity<?> handleRecordeNotFound(Model model) {
		ApiError error=new ApiError(400,appProps.getMessages().get(SSNAppConstants.NOT_FOUND),new Date());
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}
}
