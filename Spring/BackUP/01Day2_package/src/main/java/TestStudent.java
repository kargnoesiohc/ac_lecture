import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		System.out.println(s);

		//IoC 컨테이너
		
		//xml 파일에 정의된 설정 정보를 읽어와서 객체를 생성, 초기화 하고 각각의 객체를 연결한 뒤에 내부적으로 보관
		//스프링 컨테이너가 생성해서 보관하는 객체를 스프링 빈(Spring Bean)객체라고 함 *일반적으로 자바 객체와 동일
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("file:c:/XXXXXXXXXX/stu.xml"); //폴더, 파일명 대소문자 구분 x 역슬래쉬 2개 or 슬래쉬 1개 or 2개
		System.out.println(ctx);
		
	}

}
