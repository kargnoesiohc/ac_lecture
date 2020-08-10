

public class Test_ArithmeticException {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("프로그램 시작");
				int value = 0;
				int num = 0;
				try {
						num = 15/value;
				} catch (NullPointerException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
				}
				int result = num+100;
				System.out.println("연산된 값: " + result);
				System.out.println("프로그램 정상 종료");
		}

}
		
