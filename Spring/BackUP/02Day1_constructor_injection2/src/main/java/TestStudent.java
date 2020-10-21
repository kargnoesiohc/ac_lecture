import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.StudentDTO;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml"); //stu.xml 불러와서 StudentDTO 객체 생성
		 
		StudentDTO stu = ctx.getBean("firstStudent", StudentDTO.class);
		StudentDTO stu2 = ctx.getBean("secondStudent", StudentDTO.class);
		StudentDTO stu3 = ctx.getBean("thirdStudent", StudentDTO.class);
		System.out.println(stu);
		System.out.println(stu2);
		System.out.println(stu3);
	}

}
