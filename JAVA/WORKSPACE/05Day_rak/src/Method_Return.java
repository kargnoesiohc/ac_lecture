
public class Method_Return {
		public int sum(int num1,int num2) {
				System.out.println("sum() 호출");
				int result= num1+num2;
				return result;
		}
		
		public static void main(String[] args) {
				// TODO Auto-generated method stub
				int a=10;
				int b=20;
				Method_Return method_re = new Method_Return();
				int sum_result = method_re.sum(a, b);
				System.out.println("반환 결과: " +sum_result );
				
				for(String n:args) { //String[] args
						System.out.println(n); //홍길동,강감찬,이순신
				}
		}
		
		

}
