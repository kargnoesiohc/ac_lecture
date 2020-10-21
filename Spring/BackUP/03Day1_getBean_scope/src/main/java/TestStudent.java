import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.StudentDTO;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IoC Container
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/stu.xml");
		
		//scope = prototype : 하나의 Bean에 다수의 객체 생성
		StudentDTO stu1 = ctx.getBean("stu1",StudentDTO.class);
		StudentDTO stu2 = ctx.getBean("stu1",StudentDTO.class);
		System.out.print("stu1 == stu2(scpoe : prototype) -> ");
		System.out.println(stu1 == stu2); //false
		
		
		//scope = singleton : 하나의 Bean에 단 하나의 객체만 생성
		StudentDTO stu3 = ctx.getBean("stu2",StudentDTO.class);
		StudentDTO stu4 = ctx.getBean("stu2",StudentDTO.class);
		System.out.print("stu3 == stu4(scpoe : singleton -> ");
		System.out.println(stu3 == stu4); //true
		
		//scope = default(singleton)
		StudentDTO stu5 = ctx.getBean("scopeTest",StudentDTO.class);
		StudentDTO stu6 = ctx.getBean("scopeTest",StudentDTO.class);
		System.out.print("stu5 == stu6(scpoe : default(singleton) -> ");
		System.out.println(stu5 == stu6); //true
	}

}
