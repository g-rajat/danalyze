package com.danalyze.platform.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.danalyze.platform.advice.exception.DanlyzeArgumentException;

@RestControllerAdvice
public class DanalyzeControllerAdviceTypeArgument {

	@ExceptionHandler(DanlyzeArgumentException.class)
	public ResponseEntity<String> handleArgurmentException(DanlyzeArgumentException ex) {
		 
		return ResponseEntity.badRequest().body(ex.getMessage());
	}
	
}
