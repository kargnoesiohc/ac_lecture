package com.dto;

public class CatDTO {
	private String catName;
	
	public CatDTO() {
		// TODO Auto-generated constructor stub
	}

	public CatDTO(String catName) {
		super();
		this.catName = catName;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	@Override
	public String toString() {
		return "CatDTO [catName=" + catName + "]";
	}
	
	
}
