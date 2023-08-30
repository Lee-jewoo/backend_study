package com.dto;

import javax.annotation.Resource;

public class Person {
	
	String name;
	
	@Resource(name="cat1")
	Cat cat;
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", cat=" + cat + "]";
	}

}
