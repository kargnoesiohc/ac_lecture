class Outer {
				int a = 10;
				private int b = 20;
				static int c = 30;
				
				public void info() {
						int size = 100;
						
						class Inner{ //local Inner 클래스 (로컬변수 자리에 inner클래스 생성)
								int d = 40;
								//static int e = 50; //static변수 사용 불가
								public void print() {
										System.out.println(a);
										System.out.println(b);
										System.out.println(c);
										System.out.println(d);
										System.out.println(size);
								}
						} //end Inner
						Inner inner = new Inner();
						inner.print();
				}
		}
public class local_InnerClass_Test {

		
		public static void main(String[] args) {
				// TODO Auto-generated method stub
			Outer outer = new Outer();
				outer.info();
		}

}
