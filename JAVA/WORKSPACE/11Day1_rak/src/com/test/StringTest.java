package com.test;

public class StringTest {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				String a = "hello";
				String b = "hello";
				String c = new String("hello");
				String d = new String("hello");
				System.out.println(a==b ? true : false); //주소 비교 - true
				System.out.println(a.equals(b) ? true : false); //값 비교 - true
				System.out.println(c==d ? true : false); //new String() 주소 비교 - false
				System.out.println(c.equals(d) ? true : false);//new String() 값 비교 - true

		}

}
