
abstract class MyClass {
		int num = 3;

		public MyClass() {
				super();
				// TODO Auto-generated constructor stub
		}

		public MyClass(int num) {
				super();
				this.num = num;
		}
		
		public void methodA() { //일반 메소드
				System.out.println("Method A");
		}
		public abstract void methodB(); //추상 메소드
}
class MyClassImpl extends MyClass{
		public void print() {
				System.out.println(num);
		}

		@Override
		public void methodB() { //추상 메소드 오버라이딩 필수
				// TODO Auto-generated method stub
				System.out.println("Method B");
		}
}
public class Ex07_1 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				MyClassImpl imp = new MyClassImpl();
				imp.print();
				imp.methodB();
		}

}
