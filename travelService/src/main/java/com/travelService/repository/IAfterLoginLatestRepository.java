package com.travelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.travelService.model.UpcomingMovies;

@Repository
public interface IAfterLoginLatestRepository extends JpaRepository<UpcomingMovies,String>{

}
