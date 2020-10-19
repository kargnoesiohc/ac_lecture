import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.PersonDTO;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("dao.xml"); //stu.xml 불러와서 StudentDTO 객체 생성
		
		PersonDTO person1= ctx.getBean("person1", PersonDTO.class);
		PersonDTO person2= ctx.getBean("person2", PersonDTO.class);
		System.out.println(person1);
		System.out.println(person2);
		
	}	

	
	
}
