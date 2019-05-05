package com.sparks.springbootstarter.onlineShopping.list;

import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class WomenClothings {

	@Id
	String id;
	String size;
	int price;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public WomenClothings() {
	}
	
	public WomenClothings(String id, String size, int price) {
		super();
		this.id = id;
		this.size = size;
		this.price = price;
	}
}
