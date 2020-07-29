
public class Method_Test {
		
		public void a_Method(String...name) {//void -> 리턴 타입이 없음을 의미
				
				for(int i=0;i<name.length;i++) {
						System.out.println(name[i]);
				}
		}
		public void b_Method() {//void -> 리턴 타입이 없음을 의미
				System.out.println("b_Method()호출_1");
				System.out.println("b_Method()호출_2");
		}

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				//프로그램 시작
				System.out.println("Main 시작");
				
				String [] name = new String[]{"최성락","chltjdfkr1","최성락2"};
				Method_Test test = new Method_Test();
				
				test.a_Method();
				test.b_Method();
				System.out.println("Main 종료");
		}

}
