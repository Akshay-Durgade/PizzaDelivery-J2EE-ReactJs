package com.pizza.service;

import java.util.List;

import com.pizza.model.PizzaList;

public interface PizzaService 
{
	void insert(PizzaList item);
	List<PizzaList> getAll(String pizzasubcategory);
	List<PizzaList> getList();
	void delete(int id);
	PizzaList getDetails(int id);
	void update(PizzaList pizza);
}
