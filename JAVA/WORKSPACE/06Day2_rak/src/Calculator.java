
public class Calculator {
		private int a;
		private int b;
		
		public Calculator(int a, int b) {
 				this.a = a;
				this.b = b;
		}
		public int sum() {
				int sum=0;
				for(int i=0;i<4;i++) {
						sum = a+b;
						a += 10;
						b += 10;	
						System.out.println(sum);
				}
				return sum;
		}
}
