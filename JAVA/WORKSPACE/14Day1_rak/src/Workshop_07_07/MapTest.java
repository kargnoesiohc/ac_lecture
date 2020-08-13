package Workshop_07_07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				HashMap<String, Mobile> map = new HashMap<>();
				Mobile m1 = new Mobile("LU6800","Optimus 2X",800000);
				Mobile m2 = new Mobile("SU6800","Optimus Black",900000);
				Mobile m3 = new Mobile("KU5700","Optimus Big",700000);
				Mobile m4 = new Mobile("SU7600","Optimus Mach",950000);
				
				map.put(m1.getCode(),m1);
				map.put(m2.getCode(),m2);
				map.put(m3.getCode(),m3);
				map.put(m4.getCode(),m4);
				
				
				Set<String> keys = map.keySet();
				Iterator<String> ite = keys.iterator();
				double totalPrice = 0;
				//Mobile 정보, price 합계 출력
				while(ite.hasNext()) {
						String code = ite.next();
						Mobile m = map.get(code);
						System.out.println(m);
						totalPrice += m.getPrice();
				}
				System.out.println("price합계: "+totalPrice);
				System.out.println("price 10% 증가 후");
				
				totalPrice = 0;
				for(String code:keys) {
						Mobile m = map.get(code);
						double price = m.getPrice();
						m.setPrice(m.getPrice() + (m.getPrice()*0.1));
						System.out.println(m);
						totalPrice += m.getPrice();
				}
				System.out.println("price합계: "+totalPrice);
			
		}

}
