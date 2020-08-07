interface Vehicle{
		public abstract void speed();
		public default void start() {
				System.out.println("---Start---");
		}
		public static void stop() {
				System.out.println("---Stop---");
		}
}
class Car implements Vehicle {

		@Override
		public void speed() {
				// TODO Auto-generated method stub
				System.out.println("100km/h");
		}
		
}


public class Interface_2 {
		public static void main(String[] args) {
				Car c = new Car();
				c.start(); // default 메서드는  하위클래스 객체 생성 후 참조 변수를 이ㅇ용하여 호출
				c.speed(); // 추상 메서드 오버라이딩
				Vehicle.stop(); // static 메서드는 인터페이스명으로 호출
		}
}	
