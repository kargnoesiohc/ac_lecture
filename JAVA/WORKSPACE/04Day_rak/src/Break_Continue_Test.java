
public class Break_Continue_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
//		while(i<10) {
//			if(i==8) {
//				break;  //i는 8에서 continue를 실행하여 다시 while문 맨 위로 올라가기 때문에 i++이 수행되지 않는다. 
//						//때문에 i값은 증가되지 않기 때문에 계속 continue를 실행한다. 마지막 출력 i값은 8
//						//break의 경우 8에서 for문을 아예 빠져나오기 때문에 마지막 출력 값은 8
//			}
//			i++;
//			System.out.println(i);
//		} 
		
		for(i=0; i<10; i++) {
			if(i==8) {
				continue; 
			}
			System.out.println(i); //i는 8에서 continue를 수행하고 i++을 시켜주기 때문에 8은 출력되지 않고 실행 흐름은 다시 증감식으로,
								   //조건 식에 의해서 마지막 출력 값은 9 / break = 7
		}
	}

}
