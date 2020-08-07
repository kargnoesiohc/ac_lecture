package Lv_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

	public class Less_Than_X_10871 {   // Buffer 사용 미완성
		public static void main(String[] args) throws IOException {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				int n = Integer.parseInt(br.readLine());
				int x = Integer.parseInt(br.readLine());
				for(int i=0;i<n;i++) {
						StringTokenizer st = new StringTokenizer(br.readLine(), " ");
						int y = Integer.parseInt(st.nextToken());
						if(y<x) {
								bw.write(y+" ");
						}
				}
				bw.close();
				
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int x = scan.nextInt();
//		for(int i=0;i<n;i++) {
//				int y=scan.nextInt();
//				if(y<x) {
//						System.out.print(y+" ");
//				}
//		}
	}
}
