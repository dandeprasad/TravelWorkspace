package com.travelService.response;

import org.springframework.stereotype.Component;



@Component
public class BeforeUserLoginResponse {
	
	String movieTrailer;

	public String getMovieTrailer() {
		return movieTrailer;
	}

	public void setMovieTrailer(String string) {
		this.movieTrailer = string;
	}
}
	

