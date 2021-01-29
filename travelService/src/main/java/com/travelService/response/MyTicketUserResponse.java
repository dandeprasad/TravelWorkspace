package com.travelService.response;

import org.springframework.stereotype.Component;


@Component
public class MyTicketUserResponse {
 
	String MyTicket;

	public String getMyTicket() {
		return MyTicket;
	}

	public void setMyTicket(String myTicket) {
		MyTicket = myTicket;
	}
	

}
