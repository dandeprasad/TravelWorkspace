package com.travelService.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.travelService.dao.daoimpl.MyTicketUserDaoImpl;
import com.travelService.model.MyTicket;
import com.travelService.service.IMyTicketUserService;

@Component
public class MyTicketUserServiceImpl implements IMyTicketUserService {

	@Autowired
	MyTicketUserDaoImpl ticketDao;
	
	@Override
	public List<MyTicket> getMyTicketUserService() {
		List<MyTicket> ticketSer = ticketDao.getMyTicketUserDao();
		  return ticketSer;
	}

}
