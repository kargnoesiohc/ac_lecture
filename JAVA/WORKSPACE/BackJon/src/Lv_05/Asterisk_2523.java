package Lv_05;

import java.util.Scanner;

public class Asterisk_2523 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int n = scan.nextInt();
				for(int i=0;i<2*n-1;i++) {
						for(int j=0;j<=i;j++) {
								if(i+j<2*n-1) {
										System.out.print("*");
								} else {
										System.out.print(" ");
										break;
								}
						}
						System.out.println();
				}
		}

}
