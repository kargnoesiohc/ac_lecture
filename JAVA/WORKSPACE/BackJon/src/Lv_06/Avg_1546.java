package Lv_06;

import java.util.Arrays;
import java.util.Scanner;

public class Avg_1546 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				//원점수/최대점수*100 ex)수학점수 50점, 최대 점수 70점 = 50/70*100
				//과목 개수 n개 
				//현재 성적 
				Scanner scan = new Scanner(System.in);
				int n = scan.nextInt();
				double [] score = new double[n];
				double sum = 0;
					for(int i=0;i<n;i++) {
							score[i] = scan.nextDouble();
					}
					Arrays.sort(score); //오름차순 정렬 -> 제일 큰 값이 제일 마지막방에 들어감
					for(int i=0;i<score.length;i++) {
							sum += ((score[i]/score[score.length-1])*100);
					}
					System.out.println(sum/score.length);
		}

}

