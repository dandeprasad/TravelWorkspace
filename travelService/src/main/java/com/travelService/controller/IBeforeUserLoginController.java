package com.travelService.controller;

import java.util.List;
import org.springframework.stereotype.Component;
import com.travelService.model.MovieTrailer;


@Component
public interface IBeforeUserLoginController {
	
	public List<MovieTrailer>  getBeforeLoginUserController();
	
	

}