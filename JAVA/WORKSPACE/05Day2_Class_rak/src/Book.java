
public class Book { //Book 클래스
		private String title;
		private int price;
		
		
		
		public void printInfo() { //PageInfo 메서드
				System.out.println(title +"/"+ price);
		}



		public String getTitle() {
				return title;
		}



		public void setTitle(String title) {
				this.title = title;
		}



		public int getPrice() {
				return price;
		}



		public void setPrice(int price) {
				this.price = price;
		}
}
