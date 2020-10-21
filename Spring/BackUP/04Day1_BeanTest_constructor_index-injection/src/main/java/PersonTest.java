import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("com/spring/person.xml");
		
		Person person1 = ctx.getBean("xxx1", Person.class);
		System.out.println(person1.getInfo());
		Person person2 = ctx.getBean("xxx2", Person.class);
		System.out.println(person2.getInfo());
		Person person3 = ctx.getBean("xxx3", Person.class);
		System.out.println(person3.getInfo());
		Person person4 = ctx.getBean("xxx4", Person.class);
		System.out.println(person4.getInfo());
		
	}

}
