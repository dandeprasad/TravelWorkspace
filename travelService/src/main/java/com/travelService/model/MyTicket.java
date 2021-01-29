package com.travelService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity(name="my_ticket")
public class MyTicket {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@Column(name = "movie_name")
	private String movieName;
	
	@Column(name = "movie_image")
	private String movieImage;
	
	@Column(name = "starting_date")
	private String startingDate;
	
	@Column(name = "ending_date")
	private String endingDate;
	
	@Column(name = "starting_time")
	private String startingTime;
	
	@Column(name = "ending_time")
	private String endingTime;  
	
	@Column(name = "time_usage")
	private String timeUsage;

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

	public String getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(String startingDate) {
		this.startingDate = startingDate;
	}

	public String getEndingDate() {
		return endingDate;
	}

	public void setEndingDate(String endingDate) {
		this.endingDate = endingDate;
	}

	public String getStartingTime() {
		return startingTime;
	}

	public void setStartingTime(String startingTime) {
		this.startingTime = startingTime;
	}

	public String getEndingTime() {
		return endingTime;
	}

	public void setEndingTime(String endingTime) {
		this.endingTime = endingTime;
	}

	public String getTimeUsage() {
		return timeUsage;
	}

	public void setTimeUsage(String timeUsage) {
		this.timeUsage = timeUsage;
	}

}
