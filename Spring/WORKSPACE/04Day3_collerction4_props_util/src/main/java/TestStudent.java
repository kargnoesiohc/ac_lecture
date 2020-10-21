import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		
		Student stu = ctx.getBean("firstStudent", Student.class);
		
		Map<String, Cat> map = stu.getMapCat();
		Set<String> keys = map.keySet();
		for(String key: keys) {
			System.out.println(key+" : " +map.get(key));
		}
		
		Properties phones = stu.getPhones(); //Set type으로 리턴
		
		Set<String> xxx = phones.stringPropertyNames(); 
		for(String key:xxx) {
			System.out.println(key +" : "+ phones.getProperty(key));
		}
		
	}

}
