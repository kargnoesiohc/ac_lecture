package Workshop06_01;

public class Calculator {
		public double plus(int a, int b) {
				return a + b;
		}
		public double minus(int a, int b) {
				return a - b;
		}
		public double multiplication(int a, int b) {
				return a * b;
		}
		public double divide(int a, int b) throws Exception{  //throws
				double result = 0.0; 
				result = a / b;

				return result;
		}
//		public double divide(int a, int b) {
//				double result = 0.0;
//
//				try {
//						result = a / b;
//				} catch (ArithmeticException e) {
//						// TODO: handle exception
//						e.printStackTrace();
//						System.out.println("에러 발생");
//						System.out.println(e.getMessage());
//				}
//				return result;
//		}
}
