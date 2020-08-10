interface Flyer2 {
		public abstract void takeOff();
		public abstract void fly();
		public void land();
		
}


public class anony_InnerClass2 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Flyer2 f = new Flyer2() { //anonymous클래스는 인터페이스 자신을 new하여 블록안에서 추상 메소드 구현
						@Override
						public void takeOff() {
								// TODO Auto-generated method stub
								System.out.println("takeOff");
						}

						public void fly() {
								// TODO Auto-generated method stub
								System.out.println("fly");

						}

						@Override
						public void land() {
								// TODO Auto-generated method stub
								System.out.println("land");
						}  
						
				}; //익명 클래스
				f.land();

		}

}
