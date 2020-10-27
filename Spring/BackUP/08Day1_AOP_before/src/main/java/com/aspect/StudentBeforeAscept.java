package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect //공통 로직 부분, 핵심 로직 어느 함수에서 실행 할 지에 대한 등록과 실행할 코드 구현
@Component("stuAscept")
public class StudentBeforeAscept {
	//advice + pointcut을 분리
	@Pointcut("execution(* call*(..))")//call이라는 함수가 실행 될 경우
	public void xxx() {} // 실제 공통 로직이 구현된 함수(Advice) -xxx()함수 실행 등록
	
	@Before("xxx()")//joinpoint 공통 로직이 실행 될 시점
	public void callEchoBefore(JoinPoint point) {
		System.out.println("공통 로직 : " + point);
		System.out.println("공통 로직 : "+point.getSignature().getName());
		System.out.println("공통 로직 - callEchoBefore");
	}
}
 