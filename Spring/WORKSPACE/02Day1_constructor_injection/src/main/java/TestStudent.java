import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.StudentDTO;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml"); //stu.xml 불러와서 StudentDTO 객체 생성
		 
		StudentDTO stu = ctx.getBean("firstStudent", StudentDTO.class);
		System.out.println(stu.getInfo());
	}

}
