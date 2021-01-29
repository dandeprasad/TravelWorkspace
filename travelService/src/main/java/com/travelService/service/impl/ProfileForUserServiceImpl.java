package com.travelService.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.travelService.daoImpl.ProfileForUserDaoImpl;
import com.travelService.model.UserProfile;
import com.travelService.service.IProfileForUserService;


@Component
public class ProfileForUserServiceImpl implements IProfileForUserService {

	
	@Autowired
	ProfileForUserDaoImpl profileDao;
	
	@Override
	public List<UserProfile> getProfileForUserService() {
		List<UserProfile> userService = profileDao.getProfileForUserDao();
		return userService;
	}

}
