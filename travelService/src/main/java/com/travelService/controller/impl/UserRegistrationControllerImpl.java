package com.travelService.controller.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.travelService.controller.IUserRegistrationController;
import com.travelService.model.User;
import com.travelService.request.UserRegister;
import com.travelService.response.UserRegistrationResponse;
import com.travelService.service.IUserRegisterService;

@Component
@Path("/Register")
public class UserRegistrationControllerImpl implements IUserRegistrationController {
	
   @Autowired
     private IUserRegisterService registerService;
   
   @Autowired
   private UserRegistrationResponse userRegistrationResponse;
   
   
	@Override
	@POST
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/thirdpary")
	public UserRegistrationResponse UserRegisterThirdParty(UserRegister userRegister) {
		User values = registerService.ThirdPartyRegister(userRegister);
		if(values!=null) {
			userRegistrationResponse.setStatus("success");
			userRegistrationResponse.setUser(values);
		}
		else {
			userRegistrationResponse.setStatus("failed");
		}
		return userRegistrationResponse;
	}

}
