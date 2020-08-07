interface Flyer{
		public abstract void takeOff();
		public abstract void fly();
		public void land();
}

class Bird implements Flyer{

		@Override
		public void takeOff() {
				// TODO Auto-generated method stub
				System.out.println("Bird 이륙");
		}

		@Override
		public void fly() {
				// TODO Auto-generated method stub
				System.out.println("Bird 비행");

		}

		@Override
		public void land() {
				// TODO Auto-generated method stub
				System.out.println("Bird 착륙");

		}
		
}
class Airplane implements Flyer{

		@Override
		public void takeOff() {
				// TODO Auto-generated method stub
				System.out.println("Airplane 이륙");

		}

		@Override
		public void fly() {
				// TODO Auto-generated method stub
				System.out.println("Airplane 비행");

		}

		@Override
		public void land() {
				// TODO Auto-generated method stub
				System.out.println("Airplane 착륙");

		}
		
}

public class Interface_Practice {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Bird bird = new Bird();
				bird.takeOff();
				bird.fly();
				bird.land();
				Flyer flyer = new Airplane();
				flyer.takeOff();
				flyer.fly();
				flyer.land();
		}

}
