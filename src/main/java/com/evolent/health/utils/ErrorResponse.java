/**
 * 
 */
package com.evolent.health.utils;

import java.util.List;

/**
 * Will use this for Error Response
 * 
 * @author Bharat.chaudhari
 * @date Feb 10, 2020
 * 
 */
public class ErrorResponse {

	private String message;

	private List<String> details;

	public ErrorResponse(String message, List<String> details) {
		super();
		this.message = message;
		this.details = details;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getDetails() {
		return details;
	}

	public void setDetails(List<String> details) {
		this.details = details;
	}

}
