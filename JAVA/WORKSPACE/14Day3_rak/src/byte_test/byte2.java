package byte_test;

import java.io.InputStream;

public class byte2 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("데이터 입력:");
				InputStream is = System.in;
				try {
						byte[] b = new byte[5];//byte단위로 5바이트 받기 위한 배열(한글은 불가-2,3바이트)
						int n =is.read(b);//inputStream의 read()메서드를 통하여 입력한 데이터를 배열에 저장
						for(byte c:b) { 
								System.out.print((char)c); //배열에 저장된 byte를 char로 형 변환하여 출력
						}
				} catch (Exception e) {
						e.printStackTrace();
				} finally { //try블록과 관계없이 무조건 실행
						try {
								if(is!=null) is.close(); //자원 해제
						}catch(Exception e) {
								e.printStackTrace();
						}
				}
		}

}
