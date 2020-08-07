package Lv_05;

import java.util.Scanner;

public class Asterisk_2446 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int n = scan.nextInt();
				for(int i=0;i<n;i++) {
						for(int j=2*n-1;j>i;j--) {
								if(i+j>2*n-1) {
										System.out.print(" ");
								}else if(i+j<2*n+1) {
										System.out.print("*");
								} else {
										System.out.print(" ");
								}
						}
						System.out.println();
				}
				for(int i=n;i>1;i--) {
						for(int j=0;j<=2*n-1;j++) {
								if(i-j>2/n+2) {
										System.out.print(" ");
								}else if(i+j<2*n+1) {
										System.out.print("*");
								}else {
										System.out.print(" ");
										break;
								}
						}
						System.out.println();
				}
		}

}

