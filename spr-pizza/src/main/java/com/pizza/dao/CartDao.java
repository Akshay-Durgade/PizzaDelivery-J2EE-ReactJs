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

@Repository
public interface CartDao extends CrudRepository<Cart, Integer>,JpaRepository<Cart, Integer>
{
	/*
	 @Query(value="DELETE FROM cart WHERE pizzaid= :id")
	 
	 */
	
//	@Query("delete from cart b where b.pizzaid=:pizzaid")
//	void delete(@Param("pizzaid") int pizzaid);

	@Transactional
	@Modifying
	@Query(value = "UPDATE cart SET Quantity= :q WHERE pizzaid= :id ", nativeQuery = true)
	Integer updateQuantityById(@Param(value="id") int id,@Param(value="q") int quantity);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE cart SET Quantity= :q WHERE pizzaid= :id ", nativeQuery = true)
	Integer decreaseQuantityById(@Param(value="id") int id,@Param(value="q") int quantity);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM cart WHERE pizzaid= :id", nativeQuery = true)
	Integer delById(@Param(value="id") int id);
	
	@Query(value = "SELECT * FROM cart WHERE pizzaid= :id ", nativeQuery = true)
	Cart getPizzaById(@Param(value="id") int id);
	
}
