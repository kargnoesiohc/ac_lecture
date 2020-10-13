package com.dto;

public class LeportsDTO {
	private String cityname;
	private String category;
	private String content;
	private int price;
	private String address;
	private int leportsnum;
	
	public LeportsDTO() {
		// TODO Auto-generated constructor stub
	}

	public LeportsDTO(String cityname, String category, String content, int price, String address, int leportsnum) {
		super();
		this.cityname = cityname;
		this.category = category;
		this.content = content;
		this.price = price;
		this.address = address;
		this.leportsnum = leportsnum;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getLeportsnum() {
		return leportsnum;
	}

	public void setLeportsnum(int leportsnum) {
		this.leportsnum = leportsnum;
	}

	@Override
	public String toString() {
		return "leports [cityname=" + cityname + ", category=" + category + ", content=" + content + ", price=" + price
				+ ", address=" + address + ", leportsnum=" + leportsnum + "]";
	}
	
	
	
	
	
}
