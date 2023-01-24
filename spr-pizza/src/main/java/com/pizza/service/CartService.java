package com.pizza.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.pizza.model.Cart;
import com.pizza.model.PizzaList;

public interface CartService 
{
	void insert(Cart order);
	void delete(int id);
	List<Cart> getList();
	Integer addPizzaQuantity(int id,int quantity);
	Integer decreasePizzaQuantity(int id,int quantity);
	Integer delById(@Param(value="id") int id);
	Cart getDetails(int id);

}
