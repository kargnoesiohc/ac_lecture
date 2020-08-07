import com.dao.MariaDAO;
import com.dao.MySQLDAO;
import com.dao.OracleDAO;
import com.service.DBService;

public class DBMain {
		public static void main(String[] args) {
//				DBService service = new DBService();
				DBService service = DBService.getService();//4. 생성 객체를 받아와서 사용(싱글톤 디자인 패턴)
				service.setDao(new MySQLDAO());//mysql접속을 위해 객체 생성 후 service에 넘김
				service.insert();
				service.setDao(new OracleDAO());
				service.insert();
				service.setDao(new MariaDAO());
				service.insert();
				DBService service1= DBService.getService();
				DBService service2 = DBService.getService();
				DBService service3= DBService.getService();
		}
}
