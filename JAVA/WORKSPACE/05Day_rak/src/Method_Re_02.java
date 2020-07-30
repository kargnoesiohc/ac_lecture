
public class Method_Re_02 {
		public int sum(int num1, int num2) {
				System.out.println("sum() 호출 -> 실행");
				System.out.println("int num1/int num2: " +num1+ "/" +num2);
				int result = num1+num2;
				System.out.println("int result: " + result);
				System.out.println("sum() 종료 -> result 반환");
				return result;
		}
		public int sub(int num1, int num2) {
				System.out.println("sub() 호출 -> 실행");
				int result = num1-num2;
				System.out.println("int result: " +result);
				System.out.println("sub() 종료 -> result 반환");
				return result;
		}
		public int div(int num1, int num2) {
				System.out.println("div() 호출 -> 실행");
				int result = num2/num1;
				System.out.println("int result: " +result);
				System.out.println("div() 종료 -> result 반환");
				return result;

		}
		public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("메인 시작");
				int a = 10;
				int b = 20;
				Method_Re_02 method_2 = new Method_Re_02();
				int re_result1 = method_2.sum(a,b);
				int re_result2 = method_2.sub(a,b);
				int re_result3 = method_2.div(a,b);
				System.out.println("re_result1/re_result2/re_result3: " + re_result1+"/"+re_result2+"/"+re_result3);
				System.out.println("메인 종료");
		}

}
