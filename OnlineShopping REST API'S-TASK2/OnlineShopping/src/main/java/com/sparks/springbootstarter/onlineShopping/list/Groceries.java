package com.sparks.springbootstarter.onlineShopping.list;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Groceries {

	@Id
	String id;
	String DateOfManufacture;
	String weight;
	int cost;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDateOfManufacture() {
		return DateOfManufacture;
	}
	public void setDateOfManufacture(String dateOfManufacture) {
		this.DateOfManufacture = dateOfManufacture;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public Groceries(String id, String dateOfManufacture, String weight, int cost) {
		super();
		this.id = id;
		this.DateOfManufacture = dateOfManufacture;
		this.weight = weight;
		this.cost = cost;
	}
	public Groceries() {
	
	}
	
}
