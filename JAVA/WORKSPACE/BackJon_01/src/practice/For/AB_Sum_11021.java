package practice.For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AB_Sum_11021 {


		public static void main(String[] args) throws IOException {
				// TODO Auto-generated method stub
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				int t = Integer.parseInt(br.readLine());
				
				for(int i=1;i<=t;i++) {
						StringTokenizer st = new StringTokenizer(br.readLine(), " ");
						int a = Integer.parseInt(st.nextToken());
						int b = Integer.parseInt(st.nextToken());
						bw.write("Case #"+i+": "+(a+b)+"\n");
//						bw.write("Case #"+i+": "+ a +" + "+ b+" = "+(a+b)+"\n"); //11022번
				}
				bw.close();
		}

}

