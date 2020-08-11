package Workshop_07_04;

public abstract class Ship {
		String shipname;
		int fuelTank;
		public Ship() {
				// TODO Auto-generated constructor stub
		}
		public Ship(String shipname, int fuelTank) {
				super();
				this.shipname = shipname;
				this.fuelTank = fuelTank;
		}


		public abstract void sail(int dist);
		public abstract void refuel(int fuel); 
		
}
