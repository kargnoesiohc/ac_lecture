package Lv_06;

import java.util.Scanner;

public class MaxMin_10818 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int n = scan.nextInt();
				int [] arr = new int[n];
				int max = 0;
				int min = 0;
				for(int i=0;i<n;i++) {
						arr[i] = scan.nextInt();
						if(arr[min]>arr[i]) {
								min = i;
								
						}
						if(arr[max]<arr[i]) {
								max = i;
								
						}
				}
				System.out.print(arr[min]+" ");
				System.out.println(arr[max]);
		}

}
