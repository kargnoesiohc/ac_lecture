package byte_test;

import java.io.InputStream;

public class byte1 {
		public static void main(String[] args) {
				System.out.println("데이터 입력:");
				InputStream is = System.in;
				try {
						int n =is.read();//read()메서드는 1byte만 처리 - abc입력 -> a만 출력
						System.out.println((char)n); //byte로 처리가 되기때문에 char로 형 변환
				} catch (Exception e) {
						e.printStackTrace();
				} finally {
						try {
								if(is!=null) is.close(); //is가 널이 아닐경우 close
						}catch(Exception e) {
								e.printStackTrace();
						}
				}
		}
}