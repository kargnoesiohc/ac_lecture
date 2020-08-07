package Lv_05;

import java.util.Arrays;
import java.util.Scanner;

public class Three_num_10817 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int [] arr = new int[3];
				for(int i=0;i<arr.length;i++) {
						arr[i] = scan.nextInt();
				}
				Arrays.sort(arr);
				System.out.println(arr[1]);
		}
}
