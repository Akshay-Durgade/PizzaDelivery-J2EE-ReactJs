package com.pizza.service;

import com.pizza.model.OrderID;


public interface OrderIDService 
{
	void insert(OrderID order);
	Integer updateStatus(int id,String status);
	Integer getLastOrderId(int id);
	OrderID getLastOrderId();
}
