package com.dto;

public class Person {
	
	String name;
	
	Cat cat;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCat(Cat cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", cat=" + cat + "]";
	}

}
