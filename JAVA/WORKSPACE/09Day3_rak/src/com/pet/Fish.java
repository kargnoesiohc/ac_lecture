package com.pet;

public class Fish extends Pet{
		double tailsize;
		

		public Fish() {
				// TODO Auto-generated constructor stub
		}
		
		
		public Fish(String name, int age, double tailsize) {
				super(name, age);
				this.tailsize = tailsize;
		}


		@Override
		public String toString() {
				return "Fish [tailsize=" + tailsize + ", name=" + name + ", age=" + age + "]";
		}

		public double getTailsize() {
				return tailsize;
		}

		public void setTailsize(double tailsize) {
				this.tailsize = tailsize;
		}


		@Override
		public void cry() {
				// TODO Auto-generated method stub
				System.out.println("---Fish.cry()---");

		}


		@Override
		public void eat() {
				// TODO Auto-generated method stub
				System.out.println("---Fish.eat()---");

		}


		@Override
		public void sleep() {
				// TODO Auto-generated method stub
				System.out.println("---Fish.sleep()---");

		}
		
}
