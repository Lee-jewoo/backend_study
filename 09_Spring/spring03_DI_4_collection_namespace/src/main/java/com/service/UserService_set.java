package com.service;

import java.util.Set;

import com.dto.Cat;

public class UserService_set {
	
	Set<Cat> catSet;

	public Set<Cat> getCatSet() {
		return catSet;
	}

	public void setCatSet(Set<Cat> catSet) {
		this.catSet = catSet;
	}

	@Override
	public String toString() {
		return "UserService_set [catSet=" + catSet + "]";
	}

}
