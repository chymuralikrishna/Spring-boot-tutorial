package com.mk.Springboottutorial.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.mk.Springboottutorial.entity.DepartmentNotFoundException;
@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
	
	
	  @ExceptionHandler(DepartmentNotFoundException.class) 
	  public ResponseEntity<Object> departmentNotFoundException(DepartmentNotFoundException exception,WebRequest
	  request) { 
		  return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Department is not found");
	  
	  }
	 

}
