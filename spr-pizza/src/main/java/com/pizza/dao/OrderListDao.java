package com.pizza.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pizza.model.Cart;
import com.pizza.model.OrderList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pizza.model.Cart;
import com.pizza.model.OrderList;

@Repository
public interface OrderListDao extends CrudRepository<OrderList, Integer>,JpaRepository<OrderList, Integer>
{
	@Query(value = "SELECT * FROM order_list WHERE status= :id group by orderid", nativeQuery = true)
	List<OrderList> getPizzaById(@Param(value="id") String id);
//	@Param(value="id") String id
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE order_list SET status= :q WHERE orderid= :id", nativeQuery = true)
	Integer changeStatus(@Param(value="id") int id,@Param(value="q") String quantity);
	
	@Query(value = "SELECT * FROM order_list WHERE orderid=:id", nativeQuery = true)
	List<OrderList> getOrderById(@Param(value="id") int id);
}
