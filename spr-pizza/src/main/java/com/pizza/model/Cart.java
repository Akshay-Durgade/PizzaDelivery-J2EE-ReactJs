package com.pizza.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Cart 
{
	@Id
	@GeneratedValue
	private int id;
	@Column(unique=true)
	private int pizzaid;
	@Column(length=30)
	private String pizzaname;
	@Column(length=40)
	private String pizzaimage;
	private int price;
	private int quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPizzaid() {
		return pizzaid;
	}
	public void setPizzaid(int pizzaid) {
		this.pizzaid = pizzaid;
	}
	public String getPizzaname() {
		return pizzaname;
	}
	public void setPizzaname(String pizzaname) {
		this.pizzaname = pizzaname;
	}
	public String getPizzaimage() {
		return pizzaimage;
	}
	public void setPizzaimage(String pizzaimage) {
		this.pizzaimage = pizzaimage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}

/* {
        "pizzaid":1,
        "pizzaname":"Hii",
		"pizzaimage":"Hii",
		"size":"Hii",
		"price":90,
		"quantity":1
}*/
