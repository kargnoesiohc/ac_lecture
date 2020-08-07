package Lv_03;

import java.util.Scanner;

public class Asterisk_2438 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int n = scan.nextInt();
				for(int i=0;i<n;i++) {
						for(int j=0;j<=i;j++) {
								System.out.print("*");
						}
						System.out.println();
				}
//				for(int i=0;i<n;i++) {  //2439번
//						for(int j=n-1;j>=0;j--) {
//								if(i<j) {
//										System.out.print(" ");
//								} else {
//										System.out.print("*");
//								}
//						}
//						System.out.println();
//				}
		}

}



