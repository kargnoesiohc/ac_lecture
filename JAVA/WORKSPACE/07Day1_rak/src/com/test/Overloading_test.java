package com.test;

public class Overloading_test {
		public Overloading_test() {System.out.println("()생성자 호출");}
		public Overloading_test(String a) {System.out.println("(String a)생성자 호출");}
		public Overloading_test(int a) {System.out.println("(int a)생성자 호출");}
		
		public void sum() {System.out.println("() 함수 호출");}
		public void sum(int a) {System.out.println("(int a) 함수 호출");}
		public void sum(String a) {System.out.println("(String a) 함수 호출");}
		public void sum(int a, String b) {System.out.println("(int a, String b) 함수 호출");}
		public void sum(String a, int b) {System.out.println("(String a, int b) 함수 호출");}
		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Overloading_test test1 = new Overloading_test();
				
				
				test1.sum("홍길동");
				test1.sum(2000);
				test1.sum("홍길동", 20);
				test1.sum(20,"홍길동");
		}

}
