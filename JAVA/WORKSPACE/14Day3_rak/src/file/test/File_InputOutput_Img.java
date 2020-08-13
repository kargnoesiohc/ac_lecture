package file.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File_InputOutput_Img {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				FileInputStream fis = null;
				FileOutputStream fos = null;
				
				try {
						File readFile = new File("C:\\CSR\\ac_lecture\\test\\a.jpg");
						File writeFile = new File("C:\\CSR\\ac_lecture\\test\\b.jpg");
						int size = (int) readFile.length();
						byte[] readByte = new byte[size];
						fis = new FileInputStream(readFile);
						fos = new FileOutputStream(writeFile);
						int n = fis.read(readByte);
						fos.write(readByte);
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				} finally {
						try {
								if(fis!=null)fis.close();
								if(fos!=null)fos.close();
						} catch (Exception e2) {
								// TODO: handle exception
								e2.printStackTrace();
						}
				}
				
		}

}
