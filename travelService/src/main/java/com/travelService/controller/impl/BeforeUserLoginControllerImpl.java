package com.travelService.controller.impl;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.travelService.controller.IBeforeUserLoginController;
import com.travelService.model.MovieTrailer;
import com.travelService.service.IBeforeLoginService;


@Component
@Path("/guest")
public class BeforeUserLoginControllerImpl implements IBeforeUserLoginController{
	
	@Autowired
	IBeforeLoginService beforeLoginService;
	
	

@GET
@Produces({ MediaType.APPLICATION_JSON})
@Path("/movietrailers")
public List<MovieTrailer> getBeforeLoginUserController(){
	List<MovieTrailer> shows = beforeLoginService.serviceMovieTrailer();
	return shows;
}


}



/*@POST
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({ MediaType.APPLICATION_JSON })
//@Produces("text/plain")	
	
@Path("/movieTrailer")
public BeforeUserLoginResponse UserBeforeLogin(BeforeUserLogin login) {
	MovieTrailer values = beforeLoginService.showMovieTrailer(login);
	if(values!=null) {
		beforeLoginResponse.setMovieTrailer("movieTrailer");
	}
           return beforeLoginResponse ;
		
	}*/







