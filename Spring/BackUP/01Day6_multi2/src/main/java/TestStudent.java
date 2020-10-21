import org.springframework.context.support.GenericXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/*.xml");
	}

}
