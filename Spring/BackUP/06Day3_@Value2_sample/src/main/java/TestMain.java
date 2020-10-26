import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class TestMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");

		DeptService service = ctx.getBean("DeptService", DeptService.class);
		
		List<String> list = service.list();
		
		for(String x:list) {
			System.out.println(x);
		}
		System.out.println(service);
		
	}
}
