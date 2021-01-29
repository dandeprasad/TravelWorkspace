package com.travelService.controller.impl;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.travelService.controller.IProfileForUserController;
import com.travelService.model.UserProfile;
import com.travelService.service.impl.ProfileForUserServiceImpl;

@Component
@Path("/profile")
public class ProfileForUserControllerImpl implements IProfileForUserController {

	@Autowired
	ProfileForUserServiceImpl profileService;
	
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/userprofile")
	public List<UserProfile> getProfileForUserContr() {
		List<UserProfile>  userProfileCont = profileService.getProfileForUserService();
		return userProfileCont;
	}

}
