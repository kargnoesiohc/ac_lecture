package com.dao;

public class Person {
		private String name;
		private int age;
		private String address;
		
		public Person() {
				// TODO Auto-generated constructor stub
		}
		public Person(String name, int age, String address) {
				super();
				this.name = name;
				this.age = age;
				this.address = address;
		}
		
		@Override
		//toString
		public String toString() {
				return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
							
		}
		
		//setter/getter
		public String getName() {
				return name;
		}
		public void setName(String name) {
				this.name = name;
		}
		public int getAge() {
				return age;
		}
		public void setAge(int age) {
				this.age = age;
		}
		public String getAddress() {
				return address;
		}
		public void setAddress(String address) {
				this.address = address;
		}
		
		
}
