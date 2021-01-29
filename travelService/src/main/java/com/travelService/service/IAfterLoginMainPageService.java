package com.travelService.service;

import java.util.List;

import com.travelService.model.UpcomingMovies;
import com.travelService.request.AfterLoginUser;
import com.travelService.model.LatestMovies;

public interface IAfterLoginMainPageService {
	
	public List<LatestMovies> serviceLatestMovies();
	
	public List<UpcomingMovies> serviceUpcomingMovies();
	
    public LatestMovies serviceLatestFeedback(AfterLoginUser afterlogin);
    
}
