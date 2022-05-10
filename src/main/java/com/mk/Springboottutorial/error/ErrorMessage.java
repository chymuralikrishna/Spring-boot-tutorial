package com.mk.Springboottutorial.error;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {

	
	public ErrorMessage(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	private HttpStatus status;
	private String message;
}
