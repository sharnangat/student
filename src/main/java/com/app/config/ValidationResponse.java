package com.app.config;

public class ValidationResponse {

 String status;
 
 String statusCode;
 
 String  message;
 
 Object response;

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getStatusCode() {
	return statusCode;
}

public void setStatusCode(String statusCode) {
	this.statusCode = statusCode;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public Object getResponse() {
	return response;
}

public void setResponse(Object response) {
	this.response = response;
}
 
 
 
 
	
}
