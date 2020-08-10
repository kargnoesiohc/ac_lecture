
public class anony_InnerClass{

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				//1. 일반적인 방법 -> 이름있는 클래스로 처리
				Flyer b = new Bird();
				b.takeOff(100);
			//2. 익명 클래스 -> 
				Flyer b2 = new Flyer() {
						@Override
						public void takeOff(int num) {
								// TODO Auto-generated method stub
								System.out.println("SuperMan.takeOff()"+num);
						}
				}; //익명 클래스는 끝날 때 세미콜론으로 종료
				b2.takeOff(200);
				Flyer b3 = new Flyer() {
						@Override
						public void takeOff(int num) {
								// TODO Auto-generated method stub
								System.out.println("Airplane.takeOff()"+num);
						}
				};
				b3.takeOff(300);
		}

}
