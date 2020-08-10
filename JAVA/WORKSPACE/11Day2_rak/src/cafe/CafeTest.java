package cafe;

public class CafeTest {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Test0408_Cafe cafe = new Test0408_Cafe();
				cafe.setCoffeeList(new Test0408_Coffee("Americano", 4000));
				cafe.setCoffeeList(new Test0408_Coffee("Caffelatte", 5000));
				cafe.setCoffeeList(new Test0408_Coffee("Macchiato", 6000));
				
				for(int i=0;i<cafe.coffeeList.length;i++) {
						System.out.println(cafe.getCoffeeList()[i]);
				}
				
//				Test0408_Coffee [] coffeeList = new Test0408_Coffee[] {
//								new Test0408_Coffee("Americano", 4000),
//								new Test0408_Coffee("Caffelatte", 5000),
//								new Test0408_Coffee("Macchiato", 6000),
//				}; //객체 배열 생성
				
				
//				Test0408_Coffee coffee1 = new Test0408_Coffee("Americano", 4000);
//				Test0408_Coffee coffee2 = new Test0408_Coffee("Caffelatte", 5000);
//				Test0408_Coffee coffee3 = new Test0408_Coffee("Macchiato", 6000);
				
//				cafe.setCoffeeList(); 
				
//				for(Test0408_Coffee coffee: coffeeList) {
//						System.out.println(coffee.toString());
//				} //Coffee배열에 있는 객체 정보 모두 출력 for문 종료
				
				System.out.println("\nCoffee 가격의 합: "+ cafe.totalPrice());
		}

}
