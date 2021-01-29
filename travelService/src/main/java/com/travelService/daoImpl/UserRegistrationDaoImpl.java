package com.travelService.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.travelService.dao.IUserRegistrationDao;
import com.travelService.model.User;

import com.travelService.repository.IUserRegistrationRepository;

@Component
public class UserRegistrationDaoImpl implements IUserRegistrationDao {

	@Autowired
	IUserRegistrationRepository userRegistrationRepository;

	@Override
	public User saveUser(User user) {

		return userRegistrationRepository.save(user);
	}

}
