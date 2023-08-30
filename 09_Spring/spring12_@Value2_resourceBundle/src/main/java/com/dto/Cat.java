package com.dto;

import org.springframework.beans.factory.annotation.Value;

public class Cat {
	
	@Value(value="${cat.name}")
	String name;
	@Value(value="${cat.age}")
	int age;
	
	public Cat() {}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}	

}
