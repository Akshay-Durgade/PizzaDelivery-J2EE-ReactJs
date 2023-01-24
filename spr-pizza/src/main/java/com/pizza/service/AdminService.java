package com.pizza.service;

import java.util.List;

import com.pizza.model.Admin;





public interface AdminService {

	public void saveUser(Admin admin);

	public List<Admin> fetchAll();
	
}