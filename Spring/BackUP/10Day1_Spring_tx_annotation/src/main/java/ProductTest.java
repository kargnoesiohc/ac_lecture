import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.ProductDAO;
import com.entity.OrderDTO;
import com.service.ProductService;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("dept.xml");
		
		ProductService service = ctx.getBean("productService", ProductService.class);
		System.out.println(service.selectProduct());
		
		//addOrder
		try {
			service.addOrder("p03",5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("에러가 발생하여 롤백처리");
			e.printStackTrace();
		}
		
		for(OrderDTO x: service.selectOrder()) {
			System.out.println(x);
		}
	}

}

