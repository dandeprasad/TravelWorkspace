package com.travelService.response;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCartUserResponse {
	
	private String ShoppingCart;

	public String getShoppingCart() {
		return ShoppingCart;
	}

	public void setShoppingCart(String shoppingCart) {
		ShoppingCart = shoppingCart;
	}

}
