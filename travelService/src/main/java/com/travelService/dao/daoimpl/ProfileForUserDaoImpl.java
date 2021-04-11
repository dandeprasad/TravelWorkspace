package com.travelService.dao.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.travelService.dao.IProfileForUserDao;
import com.travelService.model.UserProfile;
import com.travelService.repository.IProfileForUserRepository;

@Component
public class ProfileForUserDaoImpl implements IProfileForUserDao {

	@Autowired
	IProfileForUserRepository profileRepository;
	
	@Override
	public List<UserProfile> getProfileForUserDao() {
		
		return profileRepository.findAll();
	}

}
