
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.TestDAO;
import com.dto.TestDTO;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("test.xml");
		
		TestDAO dao = ctx.getBean("testDAO", TestDAO.class);
		
//		dao.insert(8, "구마적", "종로");
		
		for(TestDTO xxx:  dao.select()) {
			System.out.println(xxx);
		}
		
//		for(TestDTO yyy: dao.selectByName("김두한")) {
//			System.out.println(yyy); 
//		}
		
	}

}
