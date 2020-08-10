
public class MainTest_04_03 {
		public static void main(String[] args) {
				Test_04_03 [] passbook = new Test_04_03[]{
						new Test_04_03("441-0209-1203",500000,7.3),
				};
				for(Test_04_03 pass: passbook) {
						System.out.println(pass.toString());
						pass.withdraw(600000);
						pass.deposit(20000);
						System.out.println(pass.toString());
						pass.withdraw(300000);
						System.out.println(pass.toString());
						System.out.println(pass.calculateInterest());
				}
				
		}
}
