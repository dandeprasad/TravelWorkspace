package com.travelService.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.travelService.model.MovieTrailer;

@Component
public interface IBeforeUserLoginDao {
	
	List<MovieTrailer> getListDao();

}
