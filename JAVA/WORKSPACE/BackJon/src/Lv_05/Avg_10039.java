package Lv_05;

import java.util.Scanner;

public class Avg_10039 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int [] arr = new int[5];
				int sum = 0;
				for(int i=0;i<5;i++) {
						int score = scan.nextInt();
						arr[i] = score;
						if(arr[i]<40) {
								arr[i] = 40;
						} 
						sum += arr[i];
				}
				System.out.println(sum/arr.length);
		}

}
