package com.controller;

public class Product {
	
	private String name;
	private String id;
	private int quantity;
	public Product() {
	}
	public Product(String name, String id, int quantity) {
		this.name = name;
		this.id = id;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", quantity=" + quantity + "]";
	}
	
}
