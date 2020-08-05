
public abstract class AbstractClass {
		private int num;
		public abstract void a(); //블록(구현부)이 없는 추상 메소드 선언
		public abstract int b(); //블록(구현부)이 없는 추상 메소드 선언
		public abstract void c(int x);//블록(구현부)이 없는 추상 메소드 선언
		public int getNum() {
				return num;
		}
		public void setNum(int num) {
				this.num = num;
		}
		public AbstractClass() {  //기본 생성자
				super();
				// TODO Auto-generated constructor stub
		}
		public AbstractClass(int num) {
				super();
				this.num = num;
		}
		
}
