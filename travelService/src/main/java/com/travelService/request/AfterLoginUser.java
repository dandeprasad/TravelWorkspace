package com.travelService.request;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@Component
@XmlRootElement
public class AfterLoginUser {
	
	private String movieName;
	private String movieImage;
	private String movieTime; 
	private String movieLang;
	private String movieYear;  
	private String movieTicket;
	private String movieHero;
	private String movieHeroin; 
	private String movieDirector;  
	private String movieMusicDirector;
	private String movieSingers; 
	private String movieRatings; 
	private String movieSummary; 
	private String movieReview; 
	private String movieComment; 
	//private Float  movieDate;
	
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
	public String getMovieTicket() {
		return movieTicket;
	}
	public void setMovieTicket(String movieTicket) {
		this.movieTicket = movieTicket;
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
	public String getMovieRatings() {
		return movieRatings;
	}
	public void setMovieRatings(String movieRatings) {
		this.movieRatings = movieRatings;
	}
	public String getMovieSummary() {
		return movieSummary;
	}
	public void setMovieSummary(String movieSummary) {
		this.movieSummary = movieSummary;
	}
	public String getMovieReview() {
		return movieReview;
	}
	public void setMovieReview(String movieReview) {
		this.movieReview = movieReview;
	}
	public String getMovieComment() {
		return movieComment;
	}
	public void setMovieComment(String movieComment) {
		this.movieComment = movieComment;
	}
	
	
}



