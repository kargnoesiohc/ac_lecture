package com.dto;

public class ProductDTO {
	String pname;
	String pid;
	int amount;
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}
	public ProductDTO(String pname, String pid, int amount) {
		super();
		this.pname = pname;
		this.pid = pid;
		this.amount = amount;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "ProductDTO [pname=" + pname + ", pid=" + pid + ", amount=" + amount + "]";
	}
	
	
	
}
