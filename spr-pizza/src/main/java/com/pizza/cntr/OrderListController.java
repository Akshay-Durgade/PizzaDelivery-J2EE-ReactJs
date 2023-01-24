package com.pizza.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pizza.model.Cart;
import com.pizza.model.OrderList;
import com.pizza.model.PizzaList;
import com.pizza.service.CartService;
import com.pizza.service.OrderListService;


@RestController
@CrossOrigin(value= {"http://localhost:3000"})
public class OrderListController
{
	@Autowired
	private OrderListService orderListService;
	
	@PostMapping(value= {"/pizzalist/order/{customerid}/{orderid}"})
	public String cartAdd(@PathVariable("customerid") int customerid, @PathVariable("orderid") int orderid)
	{
		orderListService.insert(customerid,orderid);
		return "success";
	}
	
	@GetMapping(value= {"/pizzalist/orderlist"})
	public List<OrderList> getAllOrders()
	{
		
		return orderListService.getAllOrders();
	}
	
	@PutMapping(value= {"/pizzalist/orderlist/{orderid}"})
	public void changeStatusToDelivered(@PathVariable int orderid)
	{
		orderListService.changeStatus(orderid);
	}
	
	@GetMapping(value= {"/pizzalist/orderlist/{orderid}"})
	public List<OrderList> getAllIdData()
	{
		return orderListService.getAllOrders();
	}
}

	


/*
	

*/