package com.travelService.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BeforeUserLogin {
	
	private String movieName;

	private Float  movieDate;

	private String movieDescription ;

	private String movieHours ;

	private String movieRating;

	private String movieImages ;

	
	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public float getMovieDate() {
		return movieDate;
	}

	public void setMovieDate(float movieDate) {
		this.movieDate = movieDate;
	}

	public String getMovieDescription() {
		return movieDescription;
	}

	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}

	public String getMovieHours() {
		return movieHours;
	}

	public void setMovieHours(String movieHours) {
		this.movieHours = movieHours;
	}

	public String getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(String movieRating) {
		this.movieRating = movieRating;
	}

	public String getMovieImages() {
		return movieImages;
	}

	public void setMovieImages(String movieImages) {
		this.movieImages = movieImages;
	}

}
