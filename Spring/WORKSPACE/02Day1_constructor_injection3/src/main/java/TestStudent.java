import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.CatDTO;
import com.dto.StudentDTO;


public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml"); //stu.xml 불러와서 StudentDTO 객체 생성
		 
		StudentDTO stu = ctx.getBean("firstStudent", StudentDTO.class);
		CatDTO cat = ctx.getBean("pet01", CatDTO.class);
		
		System.out.println(cat);
		System.out.println(stu);
	
	}	

}
