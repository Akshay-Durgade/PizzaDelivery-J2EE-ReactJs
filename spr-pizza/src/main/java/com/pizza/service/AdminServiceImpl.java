package com.pizza.service;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.dao.AdminDao;
import com.pizza.model.Admin;






@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;
	
	@Override
	public void saveUser(Admin admin) {
		adminDao.save(admin);

	}

	


	@Override
	public List<Admin> fetchAll() {
		
		return adminDao.findAll();
	}




}