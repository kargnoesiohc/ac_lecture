
public class TestBook {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Book book1 = new Book("SQL Plus", 50000, 5.0);
				Book book2 = new Book("Java 2.0", 40000, 3.0);
				Book book3 = new Book("JSP Servlet", 60000, 6.0);
				
				Book books [] = { book1, book2, book3, };
				System.out.println("책이름\t\t가격\t할인울\t할인후금액");
				for(Book book:books) {
						System.out.println(book.bookName+"\t" + book.bookPrice+"원\t" + book.bookDiscountRate+"%\t" + book.getDiscountBookPrice()+"원");
				}
		
		}
}
