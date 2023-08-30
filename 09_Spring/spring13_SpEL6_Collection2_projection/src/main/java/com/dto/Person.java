package com.dto;

import java.util.List;

public class Person {
	
	List<Cat> catList;
	
	// 이름을 저장하는 List
	List<String> catNameList;

	public List<Cat> getCatList() {
		return catList;
	}

	public void setCatList(List<Cat> catList) {
		this.catList = catList;
	}

	public List<String> getCatNameList() {
		return catNameList;
	}
	
	public void setCatNameList(List<String> catNameList) {
		this.catNameList = catNameList;
	}
	
}
