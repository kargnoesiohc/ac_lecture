package com.dto;

public class Store {
		String stono;
		String stoname;
		int pdno;
		int stamount;
		int stsales;
		int stprice;
		public Store() {
				// TODO Auto-generated constructor stub
		}
		public Store(String stono, String stoname, int pdno, int stamount, int stsales, int stprice) {
				super();
				this.stono = stono;
				this.stoname = stoname;
				this.pdno = pdno;
				this.stamount = stamount;
				this.stsales = stsales;
				this.stprice = stprice;
		}
		public String getStono() {
				return stono;
		}
		public void setStono(String stono) {
				this.stono = stono;
		}
		public String getStoname() {
				return stoname;
		}
		public void setStoname(String stoname) {
				this.stoname = stoname;
		}
		public int getPdno() {
				return pdno;
		}
		public void setPdno(int pdno) {
				this.pdno = pdno;
		}
		public int getStamount() {
				return stamount;
		}
		public void setStamount(int stamount) {
				this.stamount = stamount;
		}
		public int getStsales() {
				return stsales;
		}
		public void setStsales(int stsales) {
				this.stsales = stsales;
		}
		public int getStprice() {
				return stprice;
		}
		public void setStprice(int stprice) {
				this.stprice = stprice;
		}
		@Override
		public String toString() {
				return "Store [stono=" + stono + ", stoname=" + stoname + ", pdno=" + pdno + ", stamount=" + stamount
								+ ", stsales=" + stsales + ", stprice=" + stprice + "]";
		}
		
		
}
