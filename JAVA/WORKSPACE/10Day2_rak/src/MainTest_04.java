
public class MainTest_04 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Test_04 test = new Test_04();
				Test_04 [] tests = new Test_04[] {
								new Test_04("kim",100,90,95,89),
								new Test_04("Lee",60,70,99,98),
								new Test_04("Park",68,86,60,40),
				};

				for(Test_04 i:tests) {
						System.out.println(i.name+": "+i.getGrade());
				}
		}

}
