package com.travelService.response;

import org.springframework.stereotype.Component;

@Component
public class ProfileForUserResponse {
	
	private String UserProfile;

	public String getUserProfile() {
		return UserProfile;
	}

	public void setUserProfile(String userProfile) {
		UserProfile = userProfile;
	}

}
