package com.dto;

public class Cat {
	
	String name;
	int age;
	boolean isMarried;
	double height;
	
	public Cat() {}
	
	public Cat(String name, int age, boolean isMarried, double height) {
		this.name = name;
		this.age = age;
		this.isMarried = isMarried;
		this.height = height;
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
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", isMarried=" + isMarried + ", height=" + height + "]";
	}

}
