package com.dto;

public class CatDTO {
	private String catName;
	private int catAge;
	
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}
	@Override
	public String toString() {
		return "CatDTO [catName=" + catName + ", catAge=" + catAge + "]";
	}
	
	
}
