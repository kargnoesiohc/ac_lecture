import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("person.xml");
		
		Person p = ctx.getBean("person", Person.class);
		p.getInfo();
		p.mesg();
	}

}
