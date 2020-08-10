package Lv_06;

import java.util.Scanner;

public class Max_2562 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int [] arr = new int[9];
				int max = 0;
				int i = 0;
				
				for(i=0;i<9;i++) {
						arr[i] = scan.nextInt();
						if(arr[max]< arr[i]) {
								max = i;
						}
				}
				System.out.println(arr[max]);
				System.out.println(max+1);
		}

}
