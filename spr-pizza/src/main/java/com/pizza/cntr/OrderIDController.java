package com.pizza.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pizza.model.OrderID;
import com.pizza.model.PizzaList;
import com.pizza.service.OrderIDService;
import com.pizza.service.PizzaService;

@RestController
@CrossOrigin(value= {"http://localhost:3000"})
public class OrderIDController 
{
	@Autowired
	private OrderIDService orderIdService;
	
	@PostMapping(value= {"/pizzalist/orderid"})
	public String pizzaAdd(@RequestBody OrderID pizza)
	{
		pizza.setStatus("ordered");
		orderIdService.insert(pizza);
		return "success";
	}
	
	@PutMapping(value= {"/pizzalist/orderid/{orderid}/{status}"})
	public Integer updateDelivered(@PathVariable("orderid") int orderid, @PathVariable("status")String status)
	{
		return orderIdService.updateStatus(orderid, status);
	}
	
//	@GetMapping(value= {"/pizzalist/orderid/{customerid}"})
//	public Integer get(@PathVariable("orderid") int customerid)
//	{
//		return orderIdService.updateStatus();
//	}
	
	@GetMapping(value= {"/pizzalist/orderid"})
	public OrderID get()
	{
		return orderIdService.getLastOrderId();
	}
}