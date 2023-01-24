package com.pizza.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PizzaList
{
	@Id
	@GeneratedValue
	private int pizzaid ;
	@Column(length=30)
	private String pizzaname;
	@Column(length=30)
	private String pizzatype;
	@Column(length=30)
	private String pizzacategory;
	@Column(length=30)
	private String pizzasubcategory;
	@Column(length=200)
	private String pizzadescription;
	@Column(length=30)
	private String pizzaimage;
	@Column(length=30)
	private String size;

	private float price;
	
	private int quantity=1;
	
	/*
		"pizzaname":"Hii",
		"pizzatype":"Hii",
		"pizzacategory":"Hii",
		"pizzasubcategory":"Hii",
		"pizzadescription":"Hii",
		"pizzaimage":"Hii",
		"size":"Hii",
		"price":90,
		"quantity":1
	 */
	
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Column(length=30, precision=2)
	
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
	public String getPizzatype() {
		return pizzatype;
	}
	public void setPizzatype(String pizzatype) {
		this.pizzatype = pizzatype;
	}
	public String getPizzacategory() {
		return pizzacategory;
	}
	public void setPizzacategory(String pizzacategory) {
		this.pizzacategory = pizzacategory;
	}
	public String getPizzasubcategory() {
		return pizzasubcategory;
	}
	public void setPizzasubcategory(String pizzasubcategory) {
		this.pizzasubcategory = pizzasubcategory;
	}
	public String getPizzadescription() {
		return pizzadescription;
	}
	public void setPizzadescription(String pizzadescription) {
		this.pizzadescription = pizzadescription;
	}
	public String getPizzaimage() {
		return pizzaimage;
	}
	public void setPizzaimage(String pizzaimage) {
		this.pizzaimage = pizzaimage;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
}
