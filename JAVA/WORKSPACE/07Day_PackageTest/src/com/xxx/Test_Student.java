package com.xxx;
import com.cat.Cat;
import com.yyy.Student;

public class Test_Student {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
//				com.yyy.Student test = new com.yyy.Student(); //다른 패키지 연결(비추천)
//				System.out.println(test.name);
				System.out.println("main");
				Student test = new Student();
				System.out.println(test.name);
				Cat catTest = new Cat();
				System.out.println(catTest.catt);
		}

}
