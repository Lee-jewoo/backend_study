package com.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	
	String name;
	
	@Autowired
	@Qualifier(value="cat1")
	Cat cat;
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", cat=" + cat + "]";
	}

}
