package char_test;

import java.io.InputStreamReader;

public class char1 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				InputStreamReader reader = null;
				try {
						System.out.println("데이터를 입력하시오.");
						reader = new InputStreamReader(System.in); 
						int n = reader.read(); //InputStreamReader의 read때문에 2byte씩 읽기때문에 한글 안깨짐
						System.out.println("입력 값: "+ (char)n);
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				}finally {
						try {
								if(reader != null) reader.close();
						} catch (Exception e) {
								e.printStackTrace();
						}
				}
		}	

}
