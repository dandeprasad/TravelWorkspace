package com.travelService.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.travelService.dao.IBeforeUserLoginDao;
import com.travelService.helperutil.BeforeLoginHelper;
import com.travelService.model.MovieTrailer;
import com.travelService.service.IBeforeLoginService;

@Component
public class BeforeLoginServiceImpl implements IBeforeLoginService{
	
	@Autowired
	MovieTrailer movieTrailer;
	
	@Autowired
	IBeforeUserLoginDao beforeUserLoginDao;
	
	@Autowired
	BeforeLoginHelper helper;

	@Override
	public List<MovieTrailer> serviceMovieTrailer() {
		
		List<MovieTrailer> movieTrailer = beforeUserLoginDao.getListDao();
		
		return movieTrailer;
		
	}

}
