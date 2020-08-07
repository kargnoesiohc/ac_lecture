package Lv_03;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BufferedReader_15552 {

		public static void main(String[] args) throws NumberFormatException, IOException {
				// TODO Auto-generated method stub
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				int t = Integer.parseInt(br.readLine());
				
//				br.close();
				
				
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
				
				for(int i=0;i<t;i++) {
						StringTokenizer st = new StringTokenizer(br.readLine(), " ");
						int a = Integer.parseInt(st.nextToken());
						int b = Integer.parseInt(st.nextToken());
						int sum = a + b;
						bw.write(sum + "\n");
				}
				
				bw.close();
				
		}

}
