package com.travelService.service;

import java.util.List;

import com.travelService.model.ShoppingCart;

public interface IShoppingCartUserService {

	public List<ShoppingCart> getShoppingCartService();
	public ShoppingCart createShoppingCartService();

	
}
