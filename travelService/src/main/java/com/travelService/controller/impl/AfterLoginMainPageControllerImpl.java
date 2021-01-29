package com.travelService.controller.impl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.travelService.controller.IAfterLoginMainPageController;
import com.travelService.model.LatestMovies;
import com.travelService.model.UpcomingMovies;
import com.travelService.repository.IAfterLoginUpcomingRepository;
import com.travelService.request.AfterLoginUser;
import com.travelService.response.AfterLoginMainPageResponse;
import com.travelService.service.impl.AfterLoginMainPageServiceImpl;

@Component
@Path("/afterlogin")
public class AfterLoginMainPageControllerImpl implements IAfterLoginMainPageController {
	
	@Autowired
	AfterLoginMainPageServiceImpl afterLoginService;
	
	@Autowired
	IAfterLoginUpcomingRepository afterLoginRepository;
	
	@Autowired
	AfterLoginMainPageResponse afterLoginResponse;
	
	@Override
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/upcomingmovies")
	public List<UpcomingMovies> getUAfterLoginController() {
		List<UpcomingMovies> umovies = afterLoginService.serviceUpcomingMovies();
		return umovies;
	}

	@Override
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/latestmovies")
	public List<LatestMovies> getLAfterLoginController() {
		List<LatestMovies> lmovies = afterLoginService.serviceLatestMovies();
		return lmovies;
	}

	
	@POST
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/latestmovies")
	public LatestMovies saveLFeedbackContr(AfterLoginUser afterlogin) {
		
	//LatestMovies lcontrlfeedback = afterLoginService.serviceLatestFeedback(afterlogin);
		
		return null;
		
	}

	
}
