package com.pizza.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pizza.model.Admin;






@Repository
public interface AdminDao extends JpaRepository<Admin, Integer> {


	
	
}
