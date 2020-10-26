import org.springframework.context.support.GenericXmlApplicationContext;

import com.bean.EchoBean;
import com.service.OneService;
import com.service.TwoService;

public class EchoBeanTest {
	public static void main(String[] args) {
			GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("echo.xml");
			EchoBean bean = ctx.getBean("echoBean", EchoBean.class);
			
			OneService one = bean.getOne();
			TwoService two = bean.getTwo();
			
			System.out.println("EchoBean => "+bean.one());
			System.out.println("EchoBean => "+bean.two());
			System.out.println(one.one());
			System.out.println(two.two());
	}
}
