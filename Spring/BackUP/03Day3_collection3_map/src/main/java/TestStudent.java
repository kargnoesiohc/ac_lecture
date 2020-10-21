import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
//		Student s = new Student("홍길동", 20);
//		System.out.println(s);		
		//IoC 컨테이너
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("stu.xml");		
		Student stu = ctx.getBean("firstStudent" , Student.class);
		System.out.println(stu.getInfo());
		Map<String,Cat> map = stu.getMapCat();//Map얻기
		Set<String> keys = map.keySet();//Map에서 전체 Key를 얻기 
		for (String key : keys) {//전체 키에서 하나의 키 얻기 
			System.out.println(key +" = " + map.get(key).getCatInfo());//키 하나를 이용하여 value 
			//얻은 후 value 객체의 함수 호출
		}
	}
}





