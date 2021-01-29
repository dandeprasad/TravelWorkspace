package com.travelService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity(name="prime_time_ticket")
public class PrimeTimeTicket {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "movie_banner")
	private String movieBanner; 
	
	@Column(name = "movie_name")
	private String movieName; 
	
	@Column(name = "movie_duration")
	private String movieDuration;
	
	@Column(name = "release_date")
	private String releaseDate;  
	
	@Column(name = "movie_price")
	private String moviePrice;
	
	@Column(name = "booking_time")
	private String bookingTime;
	
	@Column(name = "booking_date")
	private Long bookingDate; 
	
	@Column(name = "ticket_price")
	private String ticketPrice; 
	
	@Column(name = "GST")
	private String GST;
	
	@Column(name = "total_price")
	private String totalPrice;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
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
