package com.travelService.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyTicketUser {
	
	private String movieName; 
	private String movieImage;
	private String startingDate; 
	private String endingDate;  
	private String startingTime; 
	private String endingTime;  
	private String timeUsage;
	
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
