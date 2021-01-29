package com.travelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.travelService.model.MyTicket;

@Repository
public interface IMyTicketUserRepository extends JpaRepository<MyTicket,String>{

}
