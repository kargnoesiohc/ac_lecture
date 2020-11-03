import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.DeptDTO;
import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		DeptService service = ctx.getBean("deptService", DeptService.class);
		for(DeptDTO xxx: service.selectAll()) {
			System.out.println(xxx);
		}
	}	

}
