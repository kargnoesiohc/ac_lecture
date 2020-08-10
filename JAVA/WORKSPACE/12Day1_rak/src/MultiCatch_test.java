
public class MultiCatch_test {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("프로그램 시작");
				try {
						int num = 10;
						int result = num/0;
						System.out.println(result);
				} catch (ArithmeticException e) {
								// TODO: handle exception
						System.out.println("예외 1: " + e.getMessage());
				} finally{
						System.out.println("반드시 실행되는 문장");
				}                                                
				System.out.println("프로그램 정상 종료");
		}

}
