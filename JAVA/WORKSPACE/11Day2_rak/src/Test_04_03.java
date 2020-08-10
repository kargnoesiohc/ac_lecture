
public class Test_04_03 {
		String account;
		int balance;
		double interestRate;
		public Test_04_03() {
				// TODO Auto-generated constructor stub
		}
		public Test_04_03(String account, int balance, double interestRate) {
				super();
				this.account = account;
				this.balance = balance;
				this.interestRate = interestRate;
		}
		
		@Override
		public String toString() {
				return "계좌 정보:" + account + " 현재 잔액: " + balance;
		}
		//출금
		public void withdraw(int money) {
				if(balance - money < 0 ) {
						System.out.println("출금 할 수 없습니다.");
				} else
						balance -= money;
		}
		//입금
		public int deposit(int money) { 
				return balance += money;
		}
		//이율
		public double calculateInterest() {
				double result = balance/100*interestRate;
				return result;
		}
		
		
		public String getAccount() {
				return account;
		}
		public void setAccount(String account) {
				this.account = account;
		}
		public int getBalance() {
				return balance;
		}
		public void setBalance(int balance) {
				this.balance = balance;
		}
		public double getInterestRate() {
				return interestRate;
		}
		public void setInterestRate(double interestRate) {
				this.interestRate = interestRate;
		}
		
		
}
