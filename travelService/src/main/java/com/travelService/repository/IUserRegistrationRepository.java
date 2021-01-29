package com.travelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelService.model.User;


@Repository
public interface IUserRegistrationRepository extends JpaRepository<User,Integer> {

}
