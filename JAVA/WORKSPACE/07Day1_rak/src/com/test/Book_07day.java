package com.test;

class Book{ //Book 클래스 정의
		String title;
		String writer;
		int price;
		/**
		 * @param title
		 * @param writer
		 * @param price
		 */
		public Book(String title, String writer, int price) { //Book 객체 생성
				super();
				this.title = title;
				this.writer = writer;
				this.price = price;
		}
		public String getInfo() {
				return title +"\t"+ writer +"\t"+ price;
		}
} //end class 

public class Book_07day {
		public static  void change(Book book) { //인자가 참조형이기 때문에 원래의 Book객체와 동일한 인스턴스 참조
				book.title = "Java8";								// 따라서, 원래 Book 인스턴스 값도 수정된다.
				book.price = 30000;
				book.writer = "홍길동";
		}

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Book book = new Book ("Java","안경열",20000);
				System.out.println("main 변경 전 info: "+ book.getInfo());
				change(book);
				System.out.println("main 변경 후 info: "+ book.getInfo());
				
				

		}

}
