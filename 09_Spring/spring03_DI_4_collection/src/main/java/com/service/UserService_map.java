package com.service;

import java.util.Map;

import com.dto.Cat;

public class UserService_map {
	
	Map<String, Cat> catMap;

	public Map<String, Cat> getCatMap() {
		return catMap;
	}

	public void setCatMap(Map<String, Cat> catMap) {
		this.catMap = catMap;
	}

}
