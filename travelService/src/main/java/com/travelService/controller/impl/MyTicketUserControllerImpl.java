package com.travelService.controller.impl;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.travelService.controller.IMyTicketUserController;
import com.travelService.model.MyTicket;
import com.travelService.service.impl.MyTicketUserServiceImpl;

@Component
@Path("/ticket")
public class MyTicketUserControllerImpl implements IMyTicketUserController {
	
	@Autowired
	MyTicketUserServiceImpl ticketService;

	
	
	@Override
	@GET
	@Produces({ MediaType.APPLICATION_JSON})
	@Path("/myticket")
	public List<MyTicket> getMyTicketUserController() {
		List<MyTicket> ticketContrl = ticketService.getMyTicketUserService();
		return ticketContrl;
	}

}
