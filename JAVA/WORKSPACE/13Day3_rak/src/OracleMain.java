import java.util.HashSet;

import com.dao.Person;
import com.service.OracleService;

public class OracleMain {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				OracleService service = new OracleService();
				HashSet<Person> xxx = service.select();
				for(Person s:xxx) {
						System.out.println(s);
				}
				
		}

}
