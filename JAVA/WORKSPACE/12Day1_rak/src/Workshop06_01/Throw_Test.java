package Workshop06_01;

public class Throw_Test {
		public static void a() throws Exception{
				b();
		}
		public static void b() throws Exception{
				int num = 10;
				if(num == 10) {
						//명시적으로 특정 Exception 발생하면서 메세지 지정
						throw new Exception("NullpointerException 발생");
				}
		}
		public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("프로그램 시작");
				try {
						a();
				} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e.getMessage());
				}
				System.out.println("프로그램 종료");

		}

}
