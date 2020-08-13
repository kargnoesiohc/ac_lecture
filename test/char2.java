package char_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class char2 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				BufferedReader br = null;
				try {
						System.out.println("데이터 입력: ");
						br = new BufferedReader(new InputStreamReader(System.in));
						String str = br.readLine(); //한 라인씩 읽어서 String에 저장(엔터 기준)
						System.out.println("입력 값: "+str);
				} catch (Exception e) {
						e.printStackTrace();
				} finally {
						try {
								if(br != null) br.close();
						} catch (Exception e2) {
								// TODO: handle exception
								e2.printStackTrace();
						}
				}
		}

}
