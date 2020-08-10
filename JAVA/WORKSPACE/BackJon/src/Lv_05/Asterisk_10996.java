package Lv_05;

import java.util.Scanner;

public class Asterisk_10996 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int n = scan.nextInt();
				for(int i=0;i<2*n;i++) {
						for(int j=0;j<=n-1;j++) {
								if(i%2==0) {
										if(j%2==0) {
												System.out.print("*");
										} else 
												System.out.print(" ");
								} else
										if(j%2==0) {
												System.out.print(" ");
										} else
												System.out.print("*");
						}
						System.out.println();
				}
		}

}

