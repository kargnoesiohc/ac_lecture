package properties;

import java.util.Properties;
import java.util.Set;

public class propertiesTest2 {
		public static void main(String[] args) {
				
				//Properties 이용하여 시스템 환경변수 얻기
				Properties props = System.getProperties();
				
				Set<String> keys = props.stringPropertyNames();
				for(String key:keys) {
						System.out.println(key+" -> "+props.getProperty(key));
						//ex)java.runtime.name(key) -> (value)Java(TM) SE Runtime Environment
				}
		}
}
