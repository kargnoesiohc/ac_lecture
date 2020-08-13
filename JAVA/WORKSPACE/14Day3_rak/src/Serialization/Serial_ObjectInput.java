package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Serial_ObjectInput {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				ObjectInputStream ois = null;
				try {
						File f = new File("C:\\CSR\\ac_lecture\\test","serial.dat");
						FileInputStream fis = new FileInputStream(f);
						ois = new ObjectInputStream(fis);
						Person p = (Person) ois.readObject();
						System.out.println(p.getName());
				} catch (Exception e) {
						e.printStackTrace();
				} finally {
						try {
								if(ois!=null)ois.close();
						} catch (Exception e2) {
								e2.printStackTrace();
						}
				}
		}

}
