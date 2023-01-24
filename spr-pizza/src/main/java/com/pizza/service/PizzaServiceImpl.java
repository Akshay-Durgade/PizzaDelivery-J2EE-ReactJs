package com.pizza.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.dao.PizzaDao;
import com.pizza.model.PizzaList;

@Service
public class PizzaServiceImpl implements PizzaService
{

	@Autowired
	private PizzaDao pizzaDao;
	
	@Override
	public void insert(PizzaList item) {

		pizzaDao.save(item);
	}

	@Override
	public List<PizzaList> getAll(String pizzasubcategory) 
	{
		return null;
		
	}


	@Override
	public List<PizzaList> getList() {
		Iterable<PizzaList> itr=pizzaDao.findAll();
		List<PizzaList> list=new ArrayList<>();
		itr.forEach(ele->list.add(ele));
		return list;
	}

	@Override
	public void delete(int pizzaid) {
		// TODO Auto-generated method stub
		pizzaDao.deleteById(pizzaid);
		
	}

	@Override
	public PizzaList getDetails(int id) {
		Optional<PizzaList> list=pizzaDao.findById(id);
		if(list.isPresent())
		{
			return list.get();
		}
		return null ;
	}

	@Override
	public void update(PizzaList pizza) {
		// TODO Auto-generated method stub
		pizzaDao.save(pizza);
	}

}
