package com.travelService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity(name="movie_trailer")
public class MovieTrailer  {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	
	@Column(name = "movie_name")
	private String movieName;

	@Column(name = "movie_date")
	private float movieDate;

	@Column(name = "movie_description")
	private String movieDescription ;

	@Column(name = "movie_hours")
	private String movieHours ;

	@Column(name = "movie_rating")
	private String movieRating;

	@Column(name = "movie_images")
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