package file.test;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class File_Writer {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				//write는 없으면 자동생성
				File f = new File("C:\\CSR\\ac_lecture\\test\\xxx.txt");
				//데이터 쓰기: FileWriter, FileOutputStream
				PrintWriter out = null;
				try {
						FileWriter fw = new FileWriter(f,true); //append 기존 파일이 있으면 붙인다.
						//필터
						out = new PrintWriter(fw);
						out.print("happy");
//						out.flush();
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				}finally {
						out.close();
				}
		}

}
