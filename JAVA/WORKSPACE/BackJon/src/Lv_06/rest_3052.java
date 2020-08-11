package Lv_06;

import java.util.Scanner;

public class rest_3052 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int [] arr = new int[10];
				int [] mod = new int[10];
				int count = 0;
				for(int i=0;i<arr.length;i++) {
						arr[i] = scan.nextInt();
						mod[i] = arr[i]%42; 
				}
				for(int i=0;i<mod.length;i++) {
						for(int j=i+1;j<mod.length;j++) {
								if(mod[i] != mod[j]) {
										count++;
								}
						}
				}
				System.out.println(count);
		}

}
