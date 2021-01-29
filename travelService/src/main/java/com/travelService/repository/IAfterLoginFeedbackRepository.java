package com.travelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.travelService.model.LatestMovies;


@Repository
public interface IAfterLoginFeedbackRepository extends JpaRepository<LatestMovies,String>{

}
