package com.travelService.helperutil;

public class TestingData {

	public static void main(String[] args) {
		UserRegistrationHelper userRegistrationHelper= new UserRegistrationHelper();
		String hashCode = userRegistrationHelper.generateBcryptHash("Welcome@01");
		System.out.println(hashCode);

	}

}
