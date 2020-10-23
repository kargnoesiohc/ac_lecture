import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		Student stu = ctx.getBean("xxx", Student.class);
		
		System.out.println(stu);
	}

}
