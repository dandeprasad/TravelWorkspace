package com.travelService.response;

import org.springframework.stereotype.Component;

import com.travelService.model.User;

@Component
public class UserRegistrationResponse {

	String status;
	User user;

	public String getStatus() {
		return status;
	}
	

	public void setStatus(String status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
