

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Man;
import com.dto.Woman;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		
		Man man = ctx.getBean("man",Man.class);
		Woman woman = ctx.getBean("woman",Woman.class);
		
		System.out.println(man);
		System.out.println(woman);
	}

}
