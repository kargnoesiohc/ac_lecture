
public class BookTest {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Book[] bookList = new Book[3]; //객체 배열 선언
				
				Book book1 = new Book(); //객체 생성, 초기 값 x
				Book book2 = new Book(); //객체 생성, 초기 값 x
				Book book3 = new Book(); //객체 생성, 초기 값 x
				
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
