package Lv_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Avg_1546 {

		public static void main(String[] args) throws NumberFormatException, IOException {
				// TODO Auto-generated method stub
				//원점수/최대점수*100 ex)수학점수 50점, 최대 점수 70점 = 50/70*100
				//과목 개수 n개 
				//현재 성적 
				Scanner scan = new Scanner(System.in);
				int n = scan.nextInt();
				int [] score = new int[n];
				int max = 0;
				int result = 0;
					for(int i=0;i<n;i++) {
							score[i] = scan.nextInt();
							if(score[max] <= score[i]) {
									max = i;
							}
					}
					
					for(int i=0;i<n;i++) {
							if(score[i] != score[max])
									result += score[i]/score[max]*100;
							else 
									result += score[max];
					}
					System.out.println(result/n);
		}

}
