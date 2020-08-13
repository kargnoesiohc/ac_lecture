package file.test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class file2 {
		public static void main(String[] args) {
				
				//java.nio.file.Path 클래스 - java.io.File클래스의 단점 보완
				
				Path path = Paths.get("C:\\CSR\\ac_lecture\\test\\char.java");
				boolean exsits= Files.exists(path);
				System.out.println("foldre exisit -> "+ exsits);
				boolean readable=Files.isReadable(path);
				boolean writable = Files.isWritable(path);
				boolean executable= Files.isExecutable(path);
				System.out.println(readable+ "\t"+ writable+ "\t"+ executable);
				
				//파일 및 디렉토리 생성
//				Path newdir= Paths.get("C:\\CSR\\ac_lecture\\bbb");//디렉토리생성
//				try {
//					Path xxx= Files.createDirectories(newdir);
//					System.out.println("path -> "+ xxx);
//				}catch(Exception e) {
//					e.printStackTrace();
//				}
//				Path newFile= Paths.get("C:\\CSR\\ac_lecture\\bbb\\xxx.txt");
//				Path xx2= null;
//				try {
//					xx2= Files.createFile(newFile);			
//				}catch(Exception e) {
//					e.printStackTrace();
//				}
//			
				//파일 디렉토리 삭제
//				try {
//					Files.delete(newdir);
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				
//				try {
//					Files.deleteIfExists(newFile);
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				//파일 또는 디렉토리 복사
//				Path original = Paths.get("C:\\CSR\\ac_lecture\\test\\char2.java");
				Path copy= Paths.get("C:\\CSR\\ac_lecture\\test\\charcopy.java");
//				
//				try {
//					Path yyy= Files.copy(original, copy, StandardCopyOption.REPLACE_EXISTING);
//					System.out.println(yyy);
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				
				//복사한 파일 삭제
				try {
						Files.deleteIfExists(copy);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		}
}
