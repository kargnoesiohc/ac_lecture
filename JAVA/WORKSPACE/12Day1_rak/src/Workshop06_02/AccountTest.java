package Workshop06_02;

import Workshop06_02.Account.AccountException;

public class AccountTest {

		public static void main(String[] args) throws AccountException {
				// TODO Auto-generated method stub
				Account account = new Account("441-0290-1203",500000,7.3);
				try { //입금
						System.out.println(account.toString());
						account.deposit(-1);
						
				} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e.getMessage());
				}
				try { //출금
						account.withdraw(6000);
				} catch (Exception e2) {
						System.out.println(e2.getMessage());
				}
				System.out.println(account.calculateInterset());
				System.out.println(account.toString());
		}

}
