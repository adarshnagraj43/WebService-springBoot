package com.sparks.springbootstarter.onlineShopping.list;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sports {
	
	@Id
	String id;
	int Price;
  
 public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		this.Price = price;
	}
   
	
	public Sports() {
	}
	
	public Sports(String id, int price) {
		super();
		this.id = id;
		Price = price;
	}
	}

