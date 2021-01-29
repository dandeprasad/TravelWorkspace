package com.travelService.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PrimeTimeMovieTicket {

	private String movieBanner; 
	private String movieName; 
	private String movieDuration; 
	private String releaseDate;        
	private String moviePrice;
	private String bookingTime;
	private Long bookingDate; 
	private String ticketPrice; 
	private String GST;
	private String totalPrice;
	
	
	public String getMovieBanner() {
		return movieBanner;
	}
	public void setMovieBanner(String movieBanner) {
		this.movieBanner = movieBanner;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDuration() {
		return movieDuration;
	}
	public void setMovieDuration(String movieDuration) {
		this.movieDuration = movieDuration;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getMoviePrice() {
		return moviePrice;
	}
	public void setMoviePrice(String moviePrice) {
		this.moviePrice = moviePrice;
	}
	public String getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}
	public Long getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Long bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getGST() {
		return GST;
	}
	public void setGST(String gST) {
		GST = gST;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	
	
}
