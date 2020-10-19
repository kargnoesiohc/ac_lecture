import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("dao.xml"); //stu.xml 불러와서 StudentDTO 객체 생성
		
		DeptService service = ctx.getBean("DeptService", DeptService.class);
		List<String> list = service.list();
		for (String str:list) {
			System.out.println(str);
		}
	
	}	

}
