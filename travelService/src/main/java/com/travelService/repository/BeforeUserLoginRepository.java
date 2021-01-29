package com.travelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelService.model.MovieTrailer;

@Repository
public interface BeforeUserLoginRepository extends JpaRepository<MovieTrailer,String>{

}
