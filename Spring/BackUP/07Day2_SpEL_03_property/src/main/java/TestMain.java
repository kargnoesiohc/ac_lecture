import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		
		Student stu = ctx.getBean("firstStudent", Student.class);
		Student stu2 = ctx.getBean("stu", Student.class);
		
		System.out.println("firstStudent => "+stu);
		System.out.println("stu => "+stu2);
		
	}
}
