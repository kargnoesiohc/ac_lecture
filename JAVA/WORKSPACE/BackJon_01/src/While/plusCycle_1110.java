package While;

import java.util.Scanner;

public class plusCycle_1110 {
		//n>=0 && n<=99
		//if (1)10보다 작으면 앞에 0을 붙여 두 자리 숫자로 만들고 (2)각 자리 숫자를 더한다. 
		//(3) n의 가장 오른쪽 자리수와 (2)의 가장 오른쪽 자리수를 이어붙이면 새로운 수를 만든다.
		//(4)n이 원래의 수로 돌아올 수 있는 사이클의 길이를 구하라.
		//ex)  n = 26  2+6=8 새로운 수= 68, 6+8=14 새로운 수 = 84, 8+4 = 12 새로운수 = 42, 4+2=6 새로운수 : 26
		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				
				int n = scan.nextInt();
				int copy = n;
				int count = 0;
						while (true) {
								n = (n%10*10)+(((n/10)+(n%10))%10);
								count++;
								if(copy == n) {
										break;
								}
						}
						System.out.println(count);
		}
}
