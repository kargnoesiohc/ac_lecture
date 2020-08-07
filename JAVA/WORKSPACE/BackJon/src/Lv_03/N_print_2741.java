package Lv_03;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N_print_2741 {

		public static void main(String[] args) throws  IOException {
				// TODO Auto-generated method stub
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
				int n = Integer.parseInt(br.readLine());
				
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				for(int i=n;i>=1;i--) {
						bw.write(i + "\n");
//						System.out.println(i);
				}
				bw.close();
		}

}

