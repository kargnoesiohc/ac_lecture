package com.test;
class Man{
		String name;
		int age;
		
		public Man(String name) {
				this(name, 19); //(2) 생성자에서 다른 오버로딩 생성자 호출 /*반드시 첫 라인에서 사용하며, 인자 리스트가 일치*/
				System.out.println("Person 생성자1"); // (6)
		}
		public Man(String name, int age) {// (3)

				this.name = name; // (4)
				this.age = age;
				System.out.println("Person 생성자2"); //(5)
		}
		
		public String getName() { return name; } //(8)
		public int getAge() { return age; }
		
		
}


public class Ex_05_17 {
		public static void main(String[] args) {
				Man p = new Man("홍길동"); //(1)
				System.out.println(p.getName() +" "+ p.getAge()); // (7)
		
		}
}
