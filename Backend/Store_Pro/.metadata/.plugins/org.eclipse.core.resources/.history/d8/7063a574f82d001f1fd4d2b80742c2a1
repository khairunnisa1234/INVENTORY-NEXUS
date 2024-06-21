package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private int prodId;
	
	@Column(name="productName")
	private String prodName;
	private double price;
	
	/*
	 	@Entity	: Makes the Normal Class as an Entity Class (Table in Database).
	 	@Id		: Make the variable name column as a Primary Key Column.
	 	@Column : Provides the Name for the column rather than the provided variable name.
		@Generated Value: Makes the Primary key column value generated automatically (auto_increment)
	*/
	
	
	
	public Product() {
	}

	public Product(int prodId, String prodName, double price) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}

	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + "]";
	}
}
