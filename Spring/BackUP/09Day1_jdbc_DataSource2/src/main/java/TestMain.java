import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.TestDAO;
import com.dto.TestDTO;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("test.xml");
		
		TestDAO dao = ctx.getBean("testDAO", TestDAO.class);
		
//		dao.insert(7,"김두한","종로");
		
		for(TestDTO x:  dao.select()) {
			System.out.println(x);
		}
		
	}

}
