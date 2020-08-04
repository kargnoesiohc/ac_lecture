package com.test;

class Bank{
		String name;
		private static Bank b = new Bank("XX은행"); //2. 공통 객체 1개만 사용  //static변수  private 선언
		private  Bank(String name) {this.name = name;} //1. 생성자를 private 지정, 다른 클래스에서 객체 생성 안됨, new 안됨.
		
		public static Bank getBank(){ return b; } //3. 생성한 객체를 리턴(필요한 곳에서 얻어서 사용), 외부에서 객체 생성은 불가능하지만 다른 클래스 멤버들의
																							//접근은 허용해야 한다. 따라서 생성한 객체의 참조변수를 static 메서드를 이용 외부에 돌려준다.
																							//static 사용 이유는 외부에서 객체 생성 없이 사용할 수 있기 때문
		public String getName() {return name;}
}

public class Singletone_Test {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Bank b = Bank.getBank(); //외부에서는 클래스.메서드로 참조값을 얻어서 다른 멤버들 접근
				System.out.println("Bank 이름: "+ b.getName()); 
		}

}
