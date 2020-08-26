import java.util.Date;

public class Discarded_Product {
		int pdno;
		String pdname;
		String pdsubname;
		String factno;
		String pddate;
		int pdcost;
		int pdprice;
		int pdamount;
		String discarded_date;
		
		public Discarded_Product() {
				// TODO Auto-generated constructor stub
		}

		public Discarded_Product(int pdno, String pdname, String pdsubname, String factno, String pddate, int pdcost,
						int pdprice, int pdamount, String discarded_date) {
				super();
				this.pdno = pdno;
				this.pdname = pdname;
				this.pdsubname = pdsubname;
				this.factno = factno;
				this.pddate = pddate;
				this.pdcost = pdcost;
				this.pdprice = pdprice;
				this.pdamount = pdamount;
				this.discarded_date = discarded_date;
		}

		public int getPdno() {
				return pdno;
		}

		public void setPdno(int pdno) {
				this.pdno = pdno;
		}

		public String getPdname() {
				return pdname;
		}

		public void setPdname(String pdname) {
				this.pdname = pdname;
		}

		public String getPdsubname() {
				return pdsubname;
		}

		public void setPdsubname(String pdsubname) {
				this.pdsubname = pdsubname;
		}

		public String getFactno() {
				return factno;
		}

		public void setFactno(String factno) {
				this.factno = factno;
		}

		public String getPddate() {
				return pddate;
		}

		public void setPddate(String pddate) {
				this.pddate = pddate;
		}

		public int getPdcost() {
				return pdcost;
		}

		public void setPdcost(int pdcost) {
				this.pdcost = pdcost;
		}

		public int getPdprice() {
				return pdprice;
		}

		public void setPdprice(int pdprice) {
				this.pdprice = pdprice;
		}

		public int getPdamount() {
				return pdamount;
		}

		public void setPdamount(int pdamount) {
				this.pdamount = pdamount;
		}

		public String getDiscarded_date() {
				return discarded_date;
		}

		public void setDiscarded_date(String discarded_date) {
				this.discarded_date = discarded_date;
		}

		@Override
		public String toString() {
				return "Discarded_Product [pdno=" + pdno + ", pdname=" + pdname + ", pdsubname=" + pdsubname + ", factno="
								+ factno + ", pddate=" + pddate + ", pdcost=" + pdcost + ", pdprice=" + pdprice + ", pdamount="
								+ pdamount + ", discarded_date=" + discarded_date + "]";
		}

}
