package Lv_06;

import java.util.Scanner;

public class AvgOver_4344 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				// 첫째 줄에 테스테 케이스의 개수
				// 둘째 줄부터 각 테스트 케이스바마다 학생수 n, 이어서 n명의 점수 0<= n <=100
				// 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력

				Scanner scan = new Scanner(System.in);
				int c = scan.nextInt();
				int[] stu = null;
				double avg = 0;
				for (int i = 0; i < c; i++) {
						int n = scan.nextInt();
						stu = new int[n];
						int total = 0;
						int num = 0;
						for (int j = 0; j < n; j++) {
								stu[j] = scan.nextInt();
								total += stu[j];
						}
						avg = (double) total / n;
						for (int k = 0; k < n; k++) {
								if (avg < stu[k]) {
										num++;
								}
						}
						System.out.printf("%.3f", 100.0 * num / n);
						System.out.println("%");
				}

		}

}
