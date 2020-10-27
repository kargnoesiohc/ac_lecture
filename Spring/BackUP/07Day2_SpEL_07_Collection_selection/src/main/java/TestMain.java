import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.ListStudent;
import com.dto.Student;

public class TestMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		
		ListStudent stuList1 = ctx.getBean("list", ListStudent.class);
		ListStudent stuList2 = ctx.getBean("list2", ListStudent.class);
		
		List<Student> list1 = stuList1.getList();
		System.out.println("age < 25 : ");
		for(Student x: list1) {
			System.out.println(x);
		}
		
		List<Student> list2 = stuList2.getList();
		System.out.println("age <= 25 && age > 27 && married==true : ");
		for(Student x: list2) {
			System.out.println(x);
		}
	}
}
