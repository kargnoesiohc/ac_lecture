package Work04_07_Student;

public class StudentTest2 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Student2 [] stus = new Student2[] {
								new Student2("홍길동", 15, 170, 80),
								new Student2("한사람",13,180,70),
								new Student2("임걱정",16,175,65),
				};
				int maxIdxA = 0;
				int minIdxA = 0;
				int maxIdxH = 0;
				int minIdxH = 0;
				int maxIdxW = 0;
				int minIdxW = 0;
				double totalAge = 0;
				double totalHei = 0;
				double totalWei = 0;
				System.out.println("이름\t나이\t신장\t몸무게");
				for(int i=0;i<stus.length;i++) {
						System.out.println(stus[i].stuInfo());
						totalAge += (double)stus[i].getAge();
						totalHei += (double)stus[i].getHeight();
						totalWei += (double)stus[i].getWeight();
						if(stus[maxIdxA].getAge()<stus[i].getAge()) {
								maxIdxA = i;
						}
						if(stus[minIdxA].getAge()>stus[i].getAge()) {
								minIdxA=i;
						}
						if(stus[maxIdxH].getHeight()<stus[i].getHeight()) {
								maxIdxH = i;
						}
						if(stus[minIdxH].getHeight()>stus[i].getHeight()) {
								minIdxH=i;
						}
						if(stus[maxIdxW].getWeight()<stus[i].getWeight()) {
								maxIdxW = i;
						}
						if(stus[minIdxW].getWeight()>stus[i].getWeight()) {
								minIdxW=i;
						}
				}
				System.out.println("나이 평균: "+String.format("%.3f",totalAge/stus.length));
				System.out.println("신장 평균: "+String.format("%.3f",totalHei/stus.length));
				System.out.println("몸무게 평균: "+String.format("%.3f",totalWei/stus.length));
				System.out.println("나이가 가장 많은 학생: "+String.format(stus[maxIdxA].getName()));
				System.out.println("나이가 가장 적은 학생: "+stus[minIdxA].getName());
				System.out.println("신장이 가장 큰 학생: "+stus[maxIdxH].getName());
				System.out.println("신장이 가장 작은 학생: "+stus[minIdxH].getName());
				System.out.println("몸무게가 가장 많이 나가는 학생: "+stus[maxIdxW].getName());
				System.out.println("몸무게가 가장 적게 나가는 학생: "+stus[minIdxW].getName());
				

		}

}
