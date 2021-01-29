package com.travelService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity(name="upcoming_movies")
public class UpcomingMovies {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@Column(name = "movie_name")
	private String movieName;
	
	@Column(name = "movie_image")
	private String movieImage;
	
	@Column(name = "movie_time")
	private String movieTime;
	
	@Column(name = "movie_lang")
	private String movieLang;
	
	@Column(name = "movie_year")
	private String movieYear; 
	
	@Column(name = "movie_summary")
	private String movieSummary; 
	
	@Column(name = "movie_hero")
	private String movieHero;
	
	@Column(name = "movie_heroin")
	private String movieHeroin; 
	
	@Column(name = "movie_director")
	private String movieDirector;  
	
	@Column(name = "movie_music_director")
	private String movieMusicDirector;
	
	@Column(name = "movie_singers")
	private String movieSingers;
	
	/*@Column(name = "movie_ratings")
	private String movieRatings; 
		
	@Column(name = "movie_review")
	private String movieReview; 
		
	@Column(name = "movie_comment")
	private String movieComment; 
	
	@Column(name = "movie_ticket")
	private String movieTicket; */
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieImage() {
		return movieImage;
	}

	public void setMovieImage(String movieImage) {
		this.movieImage = movieImage;
	}

	public String getMovieTime() {
		return movieTime;
	}

	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}

	public String getMovieLang() {
		return movieLang;
	}

	public void setMovieLang(String movieLang) {
		this.movieLang = movieLang;
	}

	public String getMovieYear() {
		return movieYear;
	}

	public void setMovieYear(String movieYear) {
		this.movieYear = movieYear;
	}

	public String getMovieSummary() {
		return movieSummary;
	}

	public void setMovieSummary(String movieSummary) {
		this.movieSummary = movieSummary;
	}

	public String getMovieHero() {
		return movieHero;
	}

	public void setMovieHero(String movieHero) {
		this.movieHero = movieHero;
	}

	public String getMovieHeroin() {
		return movieHeroin;
	}

	public void setMovieHeroin(String movieHeroin) {
		this.movieHeroin = movieHeroin;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public String getMovieMusicDirector() {
		return movieMusicDirector;
	}

	public void setMovieMusicDirector(String movieMusicDirector) {
		this.movieMusicDirector = movieMusicDirector;
	}

	public String getMovieSingers() {
		return movieSingers;
	}

	public void setMovieSingers(String movieSingers) {
		this.movieSingers = movieSingers;
	}
	
}



