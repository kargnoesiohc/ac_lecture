package com.pet;

public class Cat extends Pet{
		private String gender;
		
		public Cat(String name, int age, String gender) {
				super(name, age);
				this.gender = gender;
		}


		@Override
		public String toString() {
				return "Cat [gender=" + gender + ", name=" + name + ", age=" + age + "]";
		}


		public String getGender() {
				return gender;
		}


		public void setGender(String gender) {
				this.gender = gender;
		}


		@Override
		public void cry() {
				// TODO Auto-generated method stub
				System.out.println("---Cat.cry()---");
		}



		@Override
		public void eat() {
				// TODO Auto-generated method stub
				
		}

		@Override
		public void sleep() {
				// TODO Auto-generated method stub
				System.out.println("---Cat.sleep()---");

		}




}
