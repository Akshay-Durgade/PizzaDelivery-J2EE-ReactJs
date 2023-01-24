package com.pizza.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.pizza.model.OrderList;

public interface OrderListService 
{
	void insert(int customerid,int orderid);
	List<OrderList> getAllOrders();
	void changeStatus(int orderid);
	List<OrderList> getAllOrdersById(int orderid);
}
