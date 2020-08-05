
public class Engineer extends Emp {
		private String skill;
		public Engineer() {
				// TODO Auto-generated constructor stub
		}
		public Engineer(String job, String name, String skill) {
				super(job, name);
				this.skill = skill;
		}
		
		@Override 
		public String toString() { //toString() - 객체가 가지고 있는 데이터를 문자열로 만들어 리턴하는 메소드
				return "Engineer [skill=" + skill +"\t"+ name+"]";
		}
		public String getSkill() {
				return skill;
		}
		public void setSkill(String skill) {
				this.skill = skill;
		}
		@Override
		public String printInfo() {
				// TODO Auto-generated method stub
				return super.printInfo()+"\t"+skill;
		}
		
		
}
