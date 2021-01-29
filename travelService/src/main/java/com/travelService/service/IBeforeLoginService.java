package com.travelService.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.travelService.model.MovieTrailer;

@Component
public interface IBeforeLoginService {
	
	public List<MovieTrailer> serviceMovieTrailer();

}
