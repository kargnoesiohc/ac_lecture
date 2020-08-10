package Workshop06_02;

public class Account {
		String account;
		double balance;
		double interestRate; 
		public Account() {
				// TODO Auto-generated constructor stub
		}
		public Account(String account, double balance, double interestRate) {
				super();
				this.account = account;
				this.balance = balance;
				this.interestRate = interestRate;
		}
		
		
		@Override
		public String toString() {
				return "계좌정보 : " + account + " " + balance + " " + interestRate;
		}
		
		class AccountException extends Exception{
				public AccountException(String mesg) {
						super(mesg);
				}
		}
		
		public double calculateInterset() {
				double result = balance/100*interestRate;
				return result;
		}
		
		public void deposit(double money) throws AccountException{
				if(money < 0) 
						throw new AccountException("입금 금액이 0보다 적습니다.");
				
						balance += money;
		}
		
		public void withdraw(double money) throws AccountException{
				if(balance < money || money < 0) 
						throw new AccountException("금액이 0보다 적거나 현재 잔액보다 많습니다.");
				
						balance -= money;
		}
		
		
		
}
