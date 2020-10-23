package com.dto;

public class Cat {
	private String catName;
	private String catAge;
	

	public void setCatName(String catName) {
		this.catName = catName;
	}


	public void setCatAge(String catAge) {
		this.catAge = catAge;
	}

	@Override
	public String toString() {
		return "Cat [catName=" + catName + ", catAge=" + catAge + "]";
	}
	
	
	
}
