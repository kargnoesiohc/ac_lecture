
public class Emp {
		String name;
		String job;
		public Emp() {}
		public Emp(String job,String name) {
				super();
				this.job = job;
				this.name = name;
		}
		
		public String getName() {
				return name;
		}
		public void setName(String name) {
				this.name = name;
		}
		public String getJob() {
				return job;
		}
		public void setJob(String job) {
				this.job = job;
		}
		//getter, setter 생략
		public String printInfo() {
				return job+"\t"+name;
		}
}
