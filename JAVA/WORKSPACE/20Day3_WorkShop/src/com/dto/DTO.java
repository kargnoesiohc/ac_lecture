package com.dto;

public class DTO {
		String pdname;
		String pdsubname;
		String facname;
		String facloc;
		String stoname;
		int stamount;
		public DTO() {
				// TODO Auto-generated constructor stub
		}
		public DTO(String pdname, String pdsubname, String facname, String facloc, String stoname, int stamount) {
				super();
				this.pdname = pdname;
				this.pdsubname = pdsubname;
				this.facname = facname;
				this.facloc = facloc;
				this.stoname = stoname;
				this.stamount = stamount;
		}
		public String getPdname() {
				return pdname;
		}
		public void setPdname(String pdname) {
				this.pdname = pdname;
		}
		public String getPdsubname() {
				return pdsubname;
		}
		public String getFacloc() {
				return facloc;
		}
		public void setFacloc(String facloc) {
				this.facloc = facloc;
		}
		public void setPdsubname(String pdsubname) {
				this.pdsubname = pdsubname;
		}
		public String getFacname() {
				return facname;
		}
		public void setFacname(String facname) {
				this.facname = facname;
		}
		public String getStoname() {
				return stoname;
		}
		public void setStoname(String stoname) {
				this.stoname = stoname;
		}
		public int getStamount() {
				return stamount;
		}
		public void setStamount(int stamount) {
				this.stamount = stamount;
		}
		@Override
		public String toString() {
				return "DTO [pdname=" + pdname + ", pdsubname=" + pdsubname + ", facname=" + facname + ", facloc=" + facloc
								+ ", stoname=" + stoname + ", stamount=" + stamount + "]";
		}
		
}
