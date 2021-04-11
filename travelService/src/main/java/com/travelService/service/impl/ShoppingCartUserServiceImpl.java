package com.travelService.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.travelService.dao.daoimpl.ShoppingCartUserDaoImpl;
import com.travelService.helperutil.ProfileHelper;
import com.travelService.model.ShoppingCart;
import com.travelService.service.IShoppingCartUserService;

@Component
public class ShoppingCartUserServiceImpl implements IShoppingCartUserService{

	
	@Autowired
	ShoppingCart shoppingCartModel; 
	
	@Autowired
	ShoppingCartUserDaoImpl shoppingDao;
	
	
	
	@Autowired
	ProfileHelper profileHelper;
	
	@Override
	public List<ShoppingCart> getShoppingCartService() {
		
		List<ShoppingCart> shpngService = shoppingDao.getShoppingCartDao();
			
			return shpngService;
			
		}
		
		


	@Override
	public ShoppingCart createShoppingCartService() {
		
		//ShoppingCart newShpng = shoppingCart;
		
		String s = profileHelper.total_price(shoppingCartModel.getGST());
		shoppingCartModel.setGST(s);
		
		//user.setPassword(mUserRegisterVO.getPassword());
		
		shoppingCartModel.setGST(shoppingCartModel.getGST());
		return shoppingDao.createShoppingCartDao();
		
	}
	
}

