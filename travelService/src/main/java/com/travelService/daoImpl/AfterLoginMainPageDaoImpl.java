package com.travelService.daoImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.travelService.dao.IAfterLoginMainPageDao;
import com.travelService.model.UpcomingMovies;
import com.travelService.model.LatestMovies;
import com.travelService.repository.IAfterLoginFeedbackRepository;
import com.travelService.repository.IAfterLoginLatestRepository;
import com.travelService.repository.IAfterLoginUpcomingRepository;

@Component
public class AfterLoginMainPageDaoImpl implements IAfterLoginMainPageDao {

	@Autowired
	IAfterLoginUpcomingRepository afterLoginUpcmngRepo;
	
	@Autowired
	IAfterLoginLatestRepository  afterLoginLatestRepo;
	
	@Autowired
	IAfterLoginFeedbackRepository afterLoginFeedbackRepo;
	
	
	@Override
	public List<LatestMovies> getUpcomingBeforeDao() {
		
		return afterLoginUpcmngRepo.findAll();
	}

	@Override
	public List<UpcomingMovies> getLatestBeforeDao() {
		
		return afterLoginLatestRepo.findAll();
	}

	@Override
	public LatestMovies savefeedbackDao(LatestMovies latestMoviesDao) {
		return latestMoviesDao;
	}

	
}
