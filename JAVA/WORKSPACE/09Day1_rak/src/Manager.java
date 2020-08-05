
public class Manager extends Emp{
		private String depart;
		public Manager() {}
		public Manager(String job, String name, String depart) {
				super(job, name);
				this.depart = depart;
		}
		
		
		@Override
		public String toString() {
				// TODO Auto-generated method stub
				return "Manager [skill=" + depart + "\t"+name+"]";
		}
		public String getDepart() {
				return depart;
		}
		public void setDepart(String depart) {
				this.depart = depart;
		}
		@Override
		public String printInfo() {
				// TODO Auto-generated method stub
				return super.printInfo()+"\t"+depart;
		}
		@Override
		public boolean equals(Object obj) {
				if (this == obj)
						return true;
				if (obj == null)
						return false;
				if (getClass() != obj.getClass())
						return false;
				Manager other = (Manager) obj;
				if (depart == null) {
						if (other.depart != null)
								return false;
				} else if (!depart.equals(other.depart))
						return false;
				return true;
		}
		
}
