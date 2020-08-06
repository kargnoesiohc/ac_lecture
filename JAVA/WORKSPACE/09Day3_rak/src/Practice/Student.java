package Practice;

public class Student {
		String name;
		int kor;
		int eng;
		int math;
		int sci;
		
		public Student() {
				// TODO Auto-generated constructor stub
		}

		public Student(String name, int kor, int eng, int math, int sci) {
				super();
				this.name = name;
				this.kor = kor;
				this.eng = eng;
				this.math = math;
				this.sci = sci;
		}
		
		public double getAvg() {
				double result = (double) (kor+eng+math+sci)/4;
				return result;
		}
		public String getGrade() {
				String grade = "";
				if(getAvg()>=90) {
						grade = "A학점";
				} else if(getAvg()>=70) {
						grade = "B학점";

				} else if(getAvg()>=50) {
						grade = "C학점";

				} else if(getAvg()>=30) {
						grade = "D학점";

				}else 
						grade = "F학점";

				return grade;
		}

		public String getName() {
				return name;
		}

		public void setName(String name) {
				this.name = name;
		}

		public int getKor() {
				return kor;
		}

		public void setKor(int kor) {
				this.kor = kor;
		}

		public int getEng() {
				return eng;
		}

		public void setEng(int eng) {
				this.eng = eng;
		}

		public int getMath() {
				return math;
		}

		public void setMath(int math) {
				this.math = math;
		}

		public int getSci() {
				return sci;
		}

		public void setSci(int sci) {
				this.sci = sci;
		}
		
}
