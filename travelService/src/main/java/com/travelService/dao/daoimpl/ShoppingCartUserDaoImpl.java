package com.travelService.dao.daoimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.travelService.dao.IShoppingCartUserDao;
import com.travelService.model.ShoppingCart;
import com.travelService.repository.IShoppingCartGSTRepository;
import com.travelService.repository.IShoppingCartUserRepository;

@Component
public class ShoppingCartUserDaoImpl implements IShoppingCartUserDao {

	@Autowired
	IShoppingCartUserRepository shoppingRepository;
	
	@Autowired
	IShoppingCartGSTRepository gSTRepository;
	
	
	@Override
	public List<ShoppingCart> getShoppingCartDao() {
		
		return shoppingRepository.findAll();
	}

	@Override
	public ShoppingCart createShoppingCartDao() {
		
		return null;
	}

}
