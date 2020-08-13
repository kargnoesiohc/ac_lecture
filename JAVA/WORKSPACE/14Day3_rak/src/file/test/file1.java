package file.test;

import java.io.File;

public class file1 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				//java.io.File 클래스 - 물리적인 파일 및 디렉토리와 관련된 정보(메타 데이터)를 관리
				//파일명, 파일크기, 읽기모드, 쓰기모드, 디렉토리 생성 등과 같은 처리작업 담당
				//단점: 대부분의 메서드가 실패시 예외발생x 디버깅 어려움, 파일 복사, 이동 등 빈번하게 사용되는 기능 미지원, 메타데이터 접근이 비효율적, 보안속성 누락
				File f = new File("C:\\CSR\\ac_lecture\\test","char2.java");
				
				System.out.println("파일 크기: "+f.length());
				System.out.println("파일 이름: "+f.getName());
				System.out.println("파일 상대경로: "+f.getPath());
				System.out.println("파일 절대경로: "+f.getAbsolutePath());
				System.out.println("파일 인지 여부: "+f.isFile());
				System.out.println("디렉토리인지 여부: "+f.isDirectory());
				System.out.println("파일이나 디렉토리 존재 여부: "+f.exists());
				System.out.println("실행 가능 여부: "+f.canExecute());
				System.out.println("write 가능 여부: "+f.canWrite());
				System.out.println("read 가능 여부: "+f.canRead());
				System.out.println("디랙토리 생성 가능 여부: "+f.mkdir());
				
				File f2 = new File("C:\\ddd"); //경로, 파일이름
				f2.mkdir(); //파일 생성
				f2.delete(); //파일 삭제
		}

}
