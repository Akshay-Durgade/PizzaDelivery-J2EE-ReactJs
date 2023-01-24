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
import com.pizza.model.PizzaList;
import com.pizza.service.CartService;


@RestController
@CrossOrigin(value= {"http://localhost:3000"})
public class CartController 
{
	@Autowired
	private CartService cartService;
	
	@PostMapping(value= {"/pizzalist/cart"})
	public String cartAdd(@RequestBody Cart order)
	{
		cartService.insert(order);
		return "success";
	}
	
	@DeleteMapping(value= {"/pizzalist/cart/{id}"})
	public String pizzaDelete1(@PathVariable int id)
	{
		cartService.delById(id);
		return "success";
	}
	
	@GetMapping(value= {"/pizzalist/cart"})
	public List<Cart> getAll()
	{
		return cartService.getList();
	}
	
	@PutMapping(value= {"/pizzalist/cart/add/{id}/{quantity}"})
	public Integer cartAdd(@PathVariable("id") int id, @PathVariable("quantity")int quantity)
	{
		quantity=quantity+1;
		return cartService.addPizzaQuantity(id, quantity);
		
		
	}
	@PutMapping(value= {"/pizzalist/cart/sub/{id}/{quantity}"})
	public Integer cartSub(@PathVariable("id") int id, @PathVariable("quantity")int quantity)
	{
		quantity=quantity-1;
		return cartService.addPizzaQuantity(id, quantity);
	}
	
	@GetMapping(value= {"/pizzalist/cart/{id}"})
	public Cart getPizzaById(@PathVariable int id)
	{
		return cartService.getDetails(id);
	}
}

	


/*
	

*/