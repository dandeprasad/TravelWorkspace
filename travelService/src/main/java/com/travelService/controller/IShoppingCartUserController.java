package com.travelService.controller;

import java.util.List;

import com.travelService.model.ShoppingCart;

public interface IShoppingCartUserController {
	
   public List<ShoppingCart> getShoppingCartContrl();	
   //public String createShoppingCartController(ShoppingCart shoppingCart);
    public String createShoppingCartController();

}
