package com.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.dao.OrderIDDao;
import com.pizza.model.OrderID;

@Service
public class OrderIDServieImpl implements OrderIDService
{
	@Autowired
	private OrderIDDao orderIdDao;

	@Override
	public void insert(OrderID order) {
		orderIdDao.save(order);
	}

	@Override
	public Integer updateStatus(int id, String status) {
		// TODO Auto-generated method stub
		return orderIdDao.updateStatus(id,status);
	}

	@Override
	public Integer getLastOrderId(int id) {
//		// TODO Auto-generated method stub
//		return orderIdDao.getLastOrderId(id);
		return null;
	}

	@Override
	public OrderID getLastOrderId() {
		// TODO Auto-generated method stub
		return orderIdDao.getLastOrderId();
	}
	
	
}
