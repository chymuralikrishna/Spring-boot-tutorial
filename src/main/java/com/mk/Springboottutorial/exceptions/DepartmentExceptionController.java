package com.mk.Springboottutorial.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mk.Springboottutorial.entity.DepartmentNotFoundException;

@ControllerAdvice
public class DepartmentExceptionController {
	/*
	 * @ExceptionHandler(value = DepartmentNotFoundException.class) public
	 * ResponseEntity<Object> exception(DepartmentNotFoundException exception){
	 * return new ResponseEntity<>("Department not found",HttpStatus.NOT_FOUND);
	 * 
	 * }
	 */

}
