
public class ConcreteClass extends AbstractClass{
		
		
		public ConcreteClass(int num) {
				super(num);
				// TODO Auto-generated constructor stub
		}


		@Override
		public void a() {
				System.out.println("a");
				// TODO Auto-generated method stub
		}

		@Override
		public int b() {
				// TODO Auto-generated method stub
				System.out.println("b");
				return 0;
		}

		@Override
		public void c(int x) {
				System.out.println("c");
				// TODO Auto-generated method stub
		}

}
