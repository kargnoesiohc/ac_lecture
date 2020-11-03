import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.TestDAO;
import com.dto.TestDTO;

public class TestMain {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("test.xml");
		TestDAO dao = ctx.getBean("testDAO", TestDAO.class);
		
//		dao.insert(6, "강호동", "경기");
//		dao.update(4, "김두한", "종로");
//		dao.delete(6);
		ArrayList<TestDTO> list = dao.select();
		for (TestDTO dto : list) {
			System.out.println(dto);
		} // end for
	}// end main

}// end class
