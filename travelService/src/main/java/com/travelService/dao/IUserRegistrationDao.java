package com.travelService.dao;

import org.springframework.stereotype.Component;

import com.travelService.model.User;

@Component
public interface IUserRegistrationDao {

	User saveUser(User user);

}
