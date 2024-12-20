package com.dto;

public class Response {

	private String message;
    private String role;
    
    
	public Response() {
		super();
	}
	public Response(String message, String role) {
		super();
		this.message = message;
		this.role = role;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
    
    
}
