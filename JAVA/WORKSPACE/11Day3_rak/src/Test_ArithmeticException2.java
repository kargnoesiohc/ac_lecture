
public class Test_ArithmeticException2 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("프로그램 시작");
				try {
						int value = 3;
						int num = 3/value;
						int result = num + 100;
						System.out.println("연산된 값: "+ result);
				} catch(ArithmeticException e) {
						e.printStackTrace();
				}
//				System.out.println(num); //num은 try블록에서 선언 되었기 때문에 밖에서 사용할 수 없음.
				System.out.println("프로그램 종료");
		}

}
