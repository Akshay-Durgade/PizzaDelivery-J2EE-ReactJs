package com.pizza.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pizza.model.OrderID;


@Repository
public interface OrderIDDao extends CrudRepository<OrderID, Integer>, JpaRepository<OrderID, Integer>
{
	@Transactional
	@Modifying
	@Query(value = "UPDATE orderid SET status= :q WHERE orderid= :id ", nativeQuery = true)
	Integer updateStatus(@Param(value="id") int id,@Param(value="q") String status);
	
	//SELECT * FROM Table ORDER BY ID DESC LIMIT 1
//	@Query(value = "SELECT * FROM orderid ORDER BY orderid DESC LIMIT 1", nativeQuery = true)
//	OrderID getLastOrderId(@Param(value="id") int id);
	
	@Query(value = "SELECT * FROM orderid ORDER BY orderid.orderid DESC LIMIT 1", nativeQuery = true)
	OrderID getLastOrderId();
	
}
