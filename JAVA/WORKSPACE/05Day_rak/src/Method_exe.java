
public class Method_exe {
		
		public void sum(int num1, int num2) {
				System.out.println("sum() 호출 -> 실행");
				System.out.println("int num1/int num2: " +num1+ "/" +num2);
				int result = num1+num2;
				System.out.println("int result: " + result);
				System.out.println("sum() 종료");
		}
		public void sub(int num1, int num2) {
				System.out.println("sub() 호출 -> 실행");
				int result = num1-num2;
				System.out.println("int result: " +result);
				System.out.println("sub() 종료");
		}
		public void mul(String str, int num2) {
				System.out.println("mul() 호출 -> 실행");
				int result = Integer.parseInt(str)*num2;
				System.out.println("int result: " +result);
				System.out.println("mul() 종료");
		}
		public void div(int num1, int num2) {
				System.out.println("div() 호출 -> 실행");
				int result = num2/num1;
				System.out.println("int result: " +result);
				System.out.println("div() 종료");
		}
		public static void main(String[] args) {
				// TODO Auto-generated method stub
			System.out.println("메인 시작");
			int a = 10;
			int b = 20;
			Method_exe method = new Method_exe();
			method.sum(a,b);
			method.sub(a,b);
			method.mul("10",b);
			method.div(a,b);
			System.out.println("메인 종료");
		}

}
