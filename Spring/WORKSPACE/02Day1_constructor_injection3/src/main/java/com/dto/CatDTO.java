package com.dto;

public class CatDTO {
	private String catName;
	private int catAge;
	
	public CatDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public CatDTO(String catName, int catAge) {
		super();
		this.catName = catName;
		this.catAge = catAge;
	}

	@Override
	public String toString() {
		return "Cat [catName=" + catName + ", catAge=" + catAge + "]";
	}
	
	
	
	
}
