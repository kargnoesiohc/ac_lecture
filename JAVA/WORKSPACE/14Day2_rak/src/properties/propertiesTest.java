package properties;

import java.util.Properties;

public class propertiesTest {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Properties prop = new Properties();
				prop.setProperty("1", "홍길동1");
				prop.setProperty("2", "홍길동2");
				prop.setProperty("3", "홍길동3");
				
				String one = prop.getProperty("1");
				System.out.println(one);
				System.out.println(prop.getProperty("2"));
				System.out.println(prop.getProperty("3"));
		}

}
