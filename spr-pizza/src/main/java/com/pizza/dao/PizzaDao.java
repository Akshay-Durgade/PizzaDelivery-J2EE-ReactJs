package com.pizza.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pizza.model.PizzaList;

@Repository
public interface PizzaDao extends CrudRepository<PizzaList, Integer> 
{
	
}
