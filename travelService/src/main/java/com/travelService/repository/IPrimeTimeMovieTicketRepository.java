package com.travelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.travelService.model.PrimeTimeTicket;


@Component
public interface IPrimeTimeMovieTicketRepository extends JpaRepository<PrimeTimeTicket,String>{

}
