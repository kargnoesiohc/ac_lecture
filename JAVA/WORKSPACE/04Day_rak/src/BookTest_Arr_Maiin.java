
public class BookTest_Arr_Maiin {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Book[] bookList = new Book[3]; //객체 배열 선언
				
				Book book1 = new Book(); //객체 생성, 초기 값 x
				book1.title="홍길동전";
				book1.price=10000;
				Book book2 = new Book(); //객체 생성, 초기 값 x
				book2.title="춘항전";
				book2.price=20000;
				Book book3 = new Book(); //객체 생성, 초기 값 x
				book3.title="심청전";
				book3.price=20000;
				
				bookList[0] = book1; // 배열에 객체 저장
				bookList[1] = book2;
				bookList[2] = book3;
				
				System.out.println(bookList.length); //배열 크기 확인
				
				for(int i=0;i<bookList.length;i++) {
						bookList[i].printInfo();
				}
				for(Book i: bookList) {  //for each
						i.printInfo();
				}
				
		}

}
