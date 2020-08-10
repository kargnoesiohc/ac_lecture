package cafe;

public class Test0408_Coffee {
		private String name;
		private int price;
		public Test0408_Coffee() {
				// TODO Auto-generated constructor stub
		}
		public Test0408_Coffee(String name, int price) {
				super();
				this.name = name;
				this.price = price;
		}
		
		
		@Override
		public String toString() {
				return name + "\t" + price;
		}
		public int getPrice() {
				return price;
		}
		public void setPrice(int price) {
				this.price = price;
		}
		

}
