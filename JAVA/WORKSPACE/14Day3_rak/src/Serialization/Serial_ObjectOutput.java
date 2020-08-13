package Serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial_ObjectOutput {
		

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				ObjectOutputStream oos = null;
				try {
						Person p = new Person("홍길동",20);
						File f = new File("C:\\CSR\\ac_lecture\\test","serial.dat");
						FileOutputStream fos = new FileOutputStream(f);
						oos = new ObjectOutputStream(fos);
						oos.writeObject(f);
						
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				} finally {
						try {
								if(oos!=null)oos.close();
						} catch (Exception e2) {
								e2.printStackTrace();
						}
				}
		}

}
