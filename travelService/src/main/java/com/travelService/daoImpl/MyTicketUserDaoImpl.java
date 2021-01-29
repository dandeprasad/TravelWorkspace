package com.travelService.daoImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.travelService.dao.IMyTicketUserDao;
import com.travelService.model.MyTicket;
import com.travelService.repository.IMyTicketUserRepository;


@Component
public class MyTicketUserDaoImpl implements IMyTicketUserDao {

	@Autowired
	IMyTicketUserRepository ticketRepo;
	
	@Override
	public List<MyTicket> getMyTicketUserDao() {
		
		return ticketRepo.findAll();
	}

}
