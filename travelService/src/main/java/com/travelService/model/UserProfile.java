package com.travelService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity(name="userprofile")
public class UserProfile {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "firstname")
	private String firstName; 
	
	@Column(name = "lastname")
	private String lastName ; 
	
	@Column(name = "birthdate")
	private String dateOfBirth; 
	
	@Column(name = "phn_num")
	private String phoneNumber;
	
	@Column(name = "city")
	private String city; 
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country; 
	
	@Column(name = "movie_preference")
	private String moviePreference; 
	
	@Column(name = "movie_language")
	private String movieLanguage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMoviePreference() {
		return moviePreference;
	}

	public void setMoviePreference(String moviePreference) {
		this.moviePreference = moviePreference;
	}

	public String getMovieLanguage() {
		return movieLanguage;
	}

	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}

}
