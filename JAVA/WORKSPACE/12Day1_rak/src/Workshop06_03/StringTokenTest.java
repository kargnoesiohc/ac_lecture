package Workshop06_03;

import java.util.StringTokenizer;

public class StringTokenTest {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				String str = "4,2,3,6,7";
				int sum = 0;
				StringTokenizer st = new StringTokenizer(str,",");
				while(st.hasMoreTokens()) {
						sum += Integer.parseInt(st.nextToken());
				}
				System.out.println(sum);
		}
}
