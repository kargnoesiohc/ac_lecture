
public class Book {
		String bookName;
		int bookPrice;
		double bookDiscountRate;
		
		public Book() {}

		public Book(String bookName, int bookPrice, double bookDiscountRate) {
				super();
				this.bookName = bookName;
				this.bookPrice = bookPrice;
				this.bookDiscountRate = bookDiscountRate;
		}
		public double getDiscountBookPrice() {
				double result = bookPrice - (bookPrice/100*bookDiscountRate);
				return result;
		}
		
}
