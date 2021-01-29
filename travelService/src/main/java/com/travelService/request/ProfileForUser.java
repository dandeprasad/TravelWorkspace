package com.travelService.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProfileForUser {
	
	private String firstName;  
	private String lastName ; 
	private String dateOfBirth;  
	private String phoneNumber;  
	private String city; 
	private String state;  
	private String country; 
	private String moviePreference;  
	private String movieLanguage;
	
	
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
