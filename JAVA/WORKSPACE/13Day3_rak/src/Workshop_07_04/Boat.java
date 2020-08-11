package Workshop_07_04;

public class Boat extends Ship{
		
		public Boat() {
				// TODO Auto-generated constructor stub
		}

		public Boat(String shipname, int fuelTank) {
				super(shipname, fuelTank);
				// TODO Auto-generated constructor stub
		}


		@Override
		public void sail(int dist) {
				// TODO Auto-generated method stub\
				fuelTank -= (dist*10);
		}

		@Override
		public void refuel(int fuel) {
				// TODO Auto-generated method stub
				fuelTank += (fuel*10);
		}

		@Override
		public String toString() {
				return "Boat [shipname=" + shipname + ", fuelTank=" + fuelTank + "]";
		}
		
		

		
		
		
		
}
