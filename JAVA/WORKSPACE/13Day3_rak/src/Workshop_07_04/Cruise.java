package Workshop_07_04;

public class Cruise extends Ship{
		public Cruise() {
				// TODO Auto-generated constructor stub
		}

		public Cruise(String shipname, int fuelTank) {
				super(shipname, fuelTank);
				// TODO Auto-generated constructor stub
		}


		@Override
		public void sail(int dist) {
				// TODO Auto-generated method stub
				fuelTank -= (dist*13);
		}

		@Override
		public void refuel(int fuel) {
				// TODO Auto-generated method stub
				fuelTank += (fuel*8);
		}

		@Override
		public String toString() {
				return "Cruise [shipname=" + shipname + ", fuelTank=" + fuelTank + "]";
		}

		
}
