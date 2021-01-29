package com.travelService.response;

import org.springframework.stereotype.Component;

@Component
public class PrimeTimeMovieTicketResponse {
	

	String PrimeTimeTicket;

	public String getPrimeTimeTicket() {
		return PrimeTimeTicket;
	}

	public void setPrimeTimeTicket(String primeTimeTicket) {
		PrimeTimeTicket = primeTimeTicket;
	}
	
}
