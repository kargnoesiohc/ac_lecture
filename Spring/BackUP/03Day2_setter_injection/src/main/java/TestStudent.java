import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.StudentDTO;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IoC Container
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		
		StudentDTO stu = ctx.getBean("firstStudent", StudentDTO.class);
		System.out.println(stu);
	}
	

}
