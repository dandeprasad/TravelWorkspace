package com.travelService.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.travelService.dao.IUserRegistrationDao;
import com.travelService.helperutil.UserRegistrationHelper;
import com.travelService.model.User;
import com.travelService.request.UserRegister;
import com.travelService.service.IUserRegisterService;

@Component
public class UserRegisterServiceImpl implements IUserRegisterService {

	@Autowired
	public User user;

	@Autowired
	public UserRegistrationHelper userRegistrationHelper;
	
	@Autowired
	IUserRegistrationDao userRegistrationDao;

	@Override

	public User ThirdPartyRegister(UserRegister userRegister) {

		UserRegister mUserRegisterVO = userRegister;

		String hashCode = userRegistrationHelper.generateBcryptHash(mUserRegisterVO.getPassword());

		mUserRegisterVO.setPassword(hashCode);

		String fullName = userRegistrationHelper.generateFullname(mUserRegisterVO.getFirstName(),
				mUserRegisterVO.getLastName());

		// List <String> roles = mUserRegisterVO.getRole();
		

		user.setPassword(mUserRegisterVO.getPassword());
		user.setPhoneNo(mUserRegisterVO.getPhoneNo());
		user.setUsername(mUserRegisterVO.getUserName());
		user.setEmail(mUserRegisterVO.getEmail());
		user.setUserProfileName(fullName);
		user.setCreationDate(System.currentTimeMillis());
		user.setLoginType(mUserRegisterVO.getLoginType());
		return userRegistrationDao.saveUser(user);

		/*
		 * new Date().getTime() System.currentTimeMillis() Instant.now().toEpochMillis()
		 */

	}

}
