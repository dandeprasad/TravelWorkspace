package com.travelService.vo;

import java.io.Serializable;

public class CustomPrincipal implements Serializable {

	private static final long serialVersionUID = 1L;
	private String username;
	private String email;
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public CustomPrincipal() {

	}

	public CustomPrincipal(String username, String email,String id) {
		this.username = username;
		this.email = email;
		this.id = Integer.parseInt(id);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}