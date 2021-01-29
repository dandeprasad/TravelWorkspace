package com.travelService.service;

import org.springframework.stereotype.Component;

import com.travelService.model.User;
import com.travelService.request.UserRegister;

/**
 * 
 * @author Bhavya
 *
 */
@Component
public interface IUserRegisterService {
	
	public User ThirdPartyRegister(UserRegister userRegisterVO);

}
