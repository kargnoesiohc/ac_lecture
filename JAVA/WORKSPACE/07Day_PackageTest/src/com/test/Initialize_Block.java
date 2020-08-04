package com.test;

public class Initialize_Block {
		static { //1순위  /*생성자를 호출하면 생성자가 호출되기 직전에 초기화 블럭이 호출 됨*/
			System.out.println("static 초기화 블럭");
		}
		public Initialize_Block() { //3순위
				System.out.println("Initialize_Block 생성자");
		}
		{ //2순위 /*생성자를 호출하면 생성자가 호출되기 직전에 초기화 블럭이 호출 됨*/
				System.out.println("인스턴스 초기화 블럭");
		}

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Initialize_Block ib = new Initialize_Block();
		}

}
