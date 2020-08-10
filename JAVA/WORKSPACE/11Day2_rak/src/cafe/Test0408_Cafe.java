package cafe;

public class Test0408_Cafe {
		Test0408_Coffee[] coffeeList = new Test0408_Coffee[10];
		int index = 0;
//		Test0408_Coffee[] coffeeList;
		public Test0408_Cafe() {
				// TODO Auto-generated constructor stub
		}
		public void setCoffeeList(Test0408_Coffee coffee) {
				if(index < 10 ) {
						coffeeList[index] = coffee;
						index = index+1;
				} else {
						System.out.println("더이상 추가 할 수 없습니다.");
				}
				
		}
		public int totalPrice() {
				int total=0;
				for(int i=0; i<index;i++) {
						total += coffeeList[i].getPrice();
				}
				return total;
		}
		
		
		public Test0408_Coffee[] getCoffeeList() {
				return coffeeList;
		}
//
//		public void setCoffeeList(Test0408_Coffee coffee1, Test0408_Coffee coffee2, Test0408_Coffee coffee3) {
//				this.coffeeList = coffeeList;
//				System.out.println("더 이상 저장 할 수 없습니다.");
//		}
//
//
//		public int totalPrice() {
//				int total = 0;
//				for(Test0408_Coffee coffee: coffeeList) {
//						total += coffee.getPrice();
//				}
//				return total;
//		}
}
