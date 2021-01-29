package com.travelService.controller.impl;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.travelService.controller.IPrimeTimeMovieTicketController;
import com.travelService.model.PrimeTimeTicket;


@Component
@Path("/primetimemovieticket")
public class PrimeTimeMovieTicketControllerlmpl implements IPrimeTimeMovieTicketController{

	
	
	@Override
	@GET
	@Produces({ MediaType.APPLICATION_JSON})
	@Path("/movieticket")
	public List<PrimeTimeTicket> getPrimeTimeMovieTicketContrl() {
		
		return null;
	}

}
