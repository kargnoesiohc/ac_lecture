package Lv_06;

import java.util.Scanner;

public class Avg_1546_2 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int n = scan.nextInt();
				int max = 0;
				double [] score = new double[n];
				double result = 0;
				for(int i=0;i<n;i++) {
						score[i] = scan.nextDouble();
						
						if(score[max] < score[i]) max = i;
				}
				for(int i=0;i<score.length;i++) {
						result += score[i]/score[max]*100;
				}
				System.out.println(result/score.length);
		}

}
