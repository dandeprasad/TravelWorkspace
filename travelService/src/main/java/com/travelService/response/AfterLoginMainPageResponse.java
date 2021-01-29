package com.travelService.response;

import org.springframework.stereotype.Component;

@Component
public class AfterLoginMainPageResponse {
	
	String Upcomingmovies;
	String Latestmovies;
	
	
	public String getUpcomingmovies() {
		return Upcomingmovies;
	}
	public String getLatestmovies() {
		return Latestmovies;
	}

	
}
