package com.travelService.controller;

import java.util.List;
import com.travelService.model.UpcomingMovies;
import com.travelService.request.AfterLoginUser;
import com.travelService.model.LatestMovies;

public interface IAfterLoginMainPageController {
	
	public List<LatestMovies> getLAfterLoginController();
	
	public List<UpcomingMovies> getUAfterLoginController();
	
	public LatestMovies saveLFeedbackContr(AfterLoginUser afterlogin);
	
}
