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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pizza.model.PizzaList;
import com.pizza.service.PizzaService;

//------------------------------------------------
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;

//------------------------------------------------



@RestController
@CrossOrigin(value= {"http://localhost:3000"})
public class PizzaController 
{
	@Autowired
	private PizzaService pizzaService;
	
	@PostMapping(value= {"/pizzalist"})
	public String pizzaAdd(@RequestBody PizzaList pizza)
	{
		pizzaService.insert(pizza);
		return "success";
	}
	
	@GetMapping(value= {"/pizzalist"})
	public List<PizzaList> getAll()
	{
		return pizzaService.getList();
	}
	
	@GetMapping(value= {"/pizzalist/{id}"})
	public PizzaList getPizzaById(@PathVariable int id)
	{
		return pizzaService.getDetails(id);
	}
	
	@PutMapping(value= {"/pizzalist"})
	public String pizzaUpdate(@RequestBody PizzaList pizza)
	{
		pizzaService.update(pizza);
		return "success";
	}
	
	@DeleteMapping(value= {"/pizzalist"})
	public String pizzaDelete(@RequestParam int pizzaid)
	{
		pizzaService.delete(pizzaid);
		return "success";
		
	}
	@DeleteMapping(value= {"/pizzalist/{pizzaid}"})
	public String pizzaDelete1(@PathVariable int pizzaid)
	{
		pizzaService.delete(pizzaid);
		return "success";
	}
	
	
	
}


/*
{
    "pizzaname":"Hii",
    "pizzatype":"Hii",
    "pizzacategory":"Hii",
    "pizzasubcategory":"Hii",
    "pizzadescription":"Hii",
    "pizzasmall":100,
    "pizzamedium":100,
    "pizzalarge":100
}

*/