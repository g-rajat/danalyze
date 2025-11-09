package com.danalyze.platform.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class DanalyzeRestControllerAdvice {


	 @ExceptionHandler(Exception.class)
	 public ResponseEntity<String> handleException(Exception ex) {
		 
		 return  ResponseEntity.internalServerError().body(ex.getMessage());
		 
		 
	 }
	
	
}
