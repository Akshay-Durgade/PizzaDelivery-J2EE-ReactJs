package com.pizza.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderList 
{
	@Id
	@GeneratedValue
	private int serialno;
	@Column
	private int orderid;
	@Column
	private int customerid;
	@Column(length=30)
	private String pizzaname;
	@Column
	private int quantity;
	public int getSerialno() {
		return serialno;
	}
	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Column(length=40)
	private String status;
	
	/*
	  
	 */
	
	
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getPizzaname() {
		return pizzaname;
	}
	public void setPizzaname(String pizzaname) {
		this.pizzaname = pizzaname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}