package Lv_08;

import java.util.Scanner;

public class NumberSum_11720 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int n = scan.nextInt();
				int result = 0;
				String [] arr = scan.next().split("");
				for(int i=0;i<n;i++) {
						result += Integer.parseInt(arr[i]);
				}
				System.out.println(result);
		}

}
