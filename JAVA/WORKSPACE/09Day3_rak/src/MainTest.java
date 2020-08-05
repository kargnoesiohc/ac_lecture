
public class MainTest {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
//				AbstractClass abclass = new AbstractClass(); //추상 클래스는 객체 생성 불가능
				ConcreteClass cnclass = new ConcreteClass(100);
				System.out.println(cnclass.getNum());
				cnclass.a();
				int n = cnclass.b();
				cnclass.c(100);
				
				ConcreteClass2 cnclass2 = new ConcreteClass2(100);
				System.out.println(cnclass2.getNum());
				cnclass2.a();
				int n2 = cnclass2.b();
				System.out.println(n2);
				cnclass2.c(100);
				
				
		}

}
