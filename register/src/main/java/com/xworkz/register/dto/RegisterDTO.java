package com.xworkz.register.dto;


public class RegisterDTO {
	private String name;
	private String email;
	
  public RegisterDTO() {
		
	}

	public RegisterDTO(String name, String email) {
	super();
	this.name = name;
	this.email = email;
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

	@Override
	public String toString() {
		return "RegisterDTO [name=" + name + ", email=" + email + "]";
	}


	
}
