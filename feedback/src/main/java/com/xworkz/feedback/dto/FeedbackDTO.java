package com.xworkz.feedback.dto;

public class FeedbackDTO {
	private String name;
	private String email;
	private String comment;
	
	
	public FeedbackDTO() {
		
	}

	@Override
	public String toString() {
		return "FeedbackServlet [name=" + name + ", email=" + email + ", comment=" + comment + "]";
	}

	public FeedbackDTO(String name, String email, String comment) {
		super();
		this.name = name;
		this.email = email;
		this.comment = comment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}