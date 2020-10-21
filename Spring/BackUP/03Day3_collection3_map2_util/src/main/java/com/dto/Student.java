package com.dto;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private String name;
	private int age;
	private Map<String, Cat> mapCat;   //  has a  표현

	public Map<String, Cat> getMapCat() {
		return mapCat;
	}
	public void setMapCat(Map<String, Cat> mapCat) {
		this.mapCat = mapCat;
	}
	//setter injection
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getInfo() {
		return name+"\t"+age;
	}
}
