package com.dto;

public class ProductDTO {
	private String prodid;
	private String prodname;
	private int price;
	private int quantity;
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}
	public ProductDTO(String prodid, String prodname, int price, int quantity) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.price = price;
		this.quantity = quantity;
	}
	public String getProdid() {
		return prodid;
	}
	public void setProdid(String prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ProductDTO [prodid=" + prodid + ", prodname=" + prodname + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	

}
