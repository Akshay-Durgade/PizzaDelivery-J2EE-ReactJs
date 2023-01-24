package com.pizza.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.dao.CartDao;
import com.pizza.dao.PizzaDao;
import com.pizza.model.Cart;
import com.pizza.model.PizzaList;

@Service
public class CartServiceImpl implements CartService
{
	
	@Autowired
	private CartDao cartDao;
	
	@Override
	public void insert(Cart order) {
		// TODO Auto-generated method stub
		cartDao.save(order);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
//		cartDao.delete(id);
	}

	@Override
	public List<Cart> getList() {
		Iterable<Cart> itr=cartDao.findAll();
		List<Cart> list=new ArrayList<>();
		itr.forEach(ele->list.add(ele));
		return list;
	}

	@Override
	public Integer addPizzaQuantity(int id, int quantity) {
		// TODO Auto-generated method stub
		return cartDao.updateQuantityById(id,quantity);
	}

	@Override
	public Integer decreasePizzaQuantity(int id, int quantity) {
		// TODO Auto-generated method stub
		return cartDao.decreaseQuantityById(id, quantity);
	}

	@Override
	public Integer delById(int id) {
		// TODO Auto-generated method stub
		return cartDao.delById(id);
	}

	@Override
	public Cart getDetails(int id) {
		return cartDao.getPizzaById(id);
	}

}
