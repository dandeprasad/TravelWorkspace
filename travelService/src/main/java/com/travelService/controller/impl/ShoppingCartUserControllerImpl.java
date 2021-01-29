package com.travelService.controller.impl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.travelService.controller.IShoppingCartUserController;
import com.travelService.model.ShoppingCart;
import com.travelService.service.impl.ShoppingCartUserServiceImpl;


@Component
@Path("/usershoppingcart")
public class ShoppingCartUserControllerImpl implements IShoppingCartUserController  {
	
	
	@Autowired
	ShoppingCartUserServiceImpl shoppingService;

	
	@GET
	@Produces({ MediaType.APPLICATION_JSON})
	@Path("/shoppingcart")
	public List<ShoppingCart> getShoppingCartContrl() {
		
		List<ShoppingCart> shpngContrl = shoppingService.getShoppingCartService();
		
		return shpngContrl;
	}


	@Override
	@POST
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/shoppingcart")
	public String createShoppingCartController() {
		
         return null;
      
			
	}

}
