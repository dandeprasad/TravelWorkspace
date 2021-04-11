package com.travelService.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.travelService.dao.daoimpl.AfterLoginMainPageDaoImpl;
import com.travelService.model.UpcomingMovies;
import com.travelService.request.AfterLoginUser;
import com.travelService.model.LatestMovies;
import com.travelService.service.IAfterLoginMainPageService;

@Component
public class AfterLoginMainPageServiceImpl implements IAfterLoginMainPageService {
	
	@Autowired
	public LatestMovies latestMovies;
	
	@Autowired
	UpcomingMovies upcomingMovies;
	
	@Autowired
	public AfterLoginUser loginuserReq;
	
	@Autowired
	AfterLoginMainPageDaoImpl afterLoginDao;

	@Override
	public List<LatestMovies> serviceLatestMovies() {
		List<LatestMovies> lservice = afterLoginDao.getUpcomingBeforeDao();
		return lservice;
	}

	
	@Override
	public List<UpcomingMovies> serviceUpcomingMovies() {
		List<UpcomingMovies> uservice = afterLoginDao.getLatestBeforeDao();
		return uservice;
	}


	public LatestMovies serviceLatestFeedback(AfterLoginUser afterlogin) {
		
		AfterLoginUser servicefeedback = afterlogin; 
		
		loginuserReq.setMovieRatings(servicefeedback.getMovieRatings());
		loginuserReq.setMovieComment(servicefeedback.getMovieComment());
		loginuserReq.setMovieReview(servicefeedback.getMovieReview());

		return afterLoginDao.savefeedbackDao(latestMovies);
	}

}
