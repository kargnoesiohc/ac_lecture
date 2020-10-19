import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.StudentDTO;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/stu.xml"); //stu.xml 불러와서 StudentDTO 객체 생성
		 
		StudentDTO aaa = ctx.getBean("aaa",StudentDTO.class); // Bean객체에서 id가 stu인 StudentDTO클래스를 가져오기
		System.out.println(aaa);
		
		StudentDTO ccc = ctx.getBean("aaa", StudentDTO.class);
		System.out.print("aaa == ccc -> ");
		System.out.println(aaa == ccc); // true 가져오는 Bean객체의 id가 같기때문에 다른 변수에 저장해도 같은 객체
		
		StudentDTO bbb = ctx.getBean("bbb", StudentDTO.class);
		System.out.print("aaa == bbb -> ");
		System.out.println(aaa == bbb); //false Bean객체의 id가 다르기 때문에 false
		
	}

}
