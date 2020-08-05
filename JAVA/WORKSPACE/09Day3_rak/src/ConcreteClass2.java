
public class ConcreteClass2 extends AbstractClass{


		public ConcreteClass2() {
				super();
				// TODO Auto-generated constructor stub
		}

		public ConcreteClass2(int num) {
				super(num);
				// TODO Auto-generated constructor stub
		}

		@Override
		public void a() {
				// TODO Auto-generated method stub
				System.out.println("ConcreteClass.a()");
		}

		@Override
		public int b() {
				// TODO Auto-generated method stub
				System.out.println("ConcreteClass.b()");
				return 3;
		}

		@Override
		public void c(int x) {
				System.out.println("ConcreteClass.c()");
				// TODO Auto-generated method stub
				
		}

}
