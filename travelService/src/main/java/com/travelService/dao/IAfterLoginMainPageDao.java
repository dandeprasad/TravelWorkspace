package com.travelService.dao;

import java.util.List;

import com.travelService.model.UpcomingMovies;
import com.travelService.model.LatestMovies;

public interface IAfterLoginMainPageDao {
	
	List<LatestMovies> getUpcomingBeforeDao();
	List<UpcomingMovies> getLatestBeforeDao();
	LatestMovies savefeedbackDao(LatestMovies latestMoviesDao);

}
