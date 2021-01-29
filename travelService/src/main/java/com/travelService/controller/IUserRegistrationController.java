package com.travelService.controller;

import org.springframework.stereotype.Component;
import com.travelService.request.UserRegister;

/** @author Bhavya
 * 
 */

import com.travelService.response.UserRegistrationResponse;

@Component
public interface IUserRegistrationController {
	
	
	public UserRegistrationResponse UserRegisterThirdParty(UserRegister userRegisterVO); 
		
}


