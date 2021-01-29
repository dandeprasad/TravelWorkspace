package com.travelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.travelService.model.ShoppingCart;


@Repository
public interface IShoppingCartUserRepository extends JpaRepository<ShoppingCart,String>{

}
