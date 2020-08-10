package Workshop06_01;

public class CalcTest {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(args[0]);
				String sign = args[1]; 
				int b = Integer.parseInt(args[2]);
				String operator = sign.substring(0,1);
				Calculator calc = new Calculator();
				System.out.println("프로그램 시작");
				System.out.println(a + sign + b);
				
				if(operator.equals("+")) {
						System.out.println(calc.plus(a, b));
				} else if(operator.equals("-")) {
						System.out.println(calc.minus(a, b));
				} else if(operator.equals("*")) {
						System.out.println(calc.multiplication(a, b));
				} else if(operator.equals("/")) {
						try {
								System.out.println(calc.divide(a, b));
						} catch (Exception e) {
								// TODO: handle exception
			        	 System.out.println("Exception 이 발생 하였습니다. 다시 입력해 주세요");

						}
				}
				System.out.println("프로그램 종료");
		}

}
