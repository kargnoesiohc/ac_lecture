package file.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class File_Reader {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				File f = new File("C:\\CSR\\ac_lecture\\test\\char2.java");
				BufferedReader br = null;
				try {
						
						FileReader fr = new FileReader(f);
						br = new BufferedReader(fr);
						String str = br.readLine();
						
						while(str!=null) {
								System.out.println(str);
								str = br.readLine();
						}
				} catch (Exception e) {
						e.printStackTrace();
				}finally {
						try {
								if(br!=null) br.close();
						} catch(Exception e) {
								e.printStackTrace();
						}
				}
		}

}
