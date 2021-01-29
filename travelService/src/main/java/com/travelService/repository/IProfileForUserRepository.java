package com.travelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.travelService.model.UserProfile;

@Repository
public interface IProfileForUserRepository extends JpaRepository<UserProfile,String>{

}
