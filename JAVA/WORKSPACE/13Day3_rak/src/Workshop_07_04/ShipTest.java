package Workshop_07_04;

import java.util.ArrayList;

public class ShipTest {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				ArrayList<Ship> list = new ArrayList<Ship>();
				
				list.add(new Boat("Boat01",500));
				list.add(new Cruise("Cruise01",1000));
				for(Ship s:list) {
						System.out.println("운항/주유 전 :"+s);
						if(s instanceof Boat) {
								Boat b = (Boat)s;
								b.sail(10); //운항 - (연료량 = 운항*10 감소)
								b.refuel(20);//주유 - (연료량 = 주유*10 감소)
								System.out.println("운항/주유 후 :"+b);
						} else {
								s.sail(15); //운항 - (연료량 = 운항*13 감소)
								s.refuel(30);//주유 - (연료량 = 주유*15증가)
								System.out.println("운항/주유 후 :"+s);
						}
						
				}
		}

}
