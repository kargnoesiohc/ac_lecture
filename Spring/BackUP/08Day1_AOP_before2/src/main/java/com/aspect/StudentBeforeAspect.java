package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("aspect")
@Aspect //공통 로직 부분, 핵심 로직 어느 함수에서 실행 할 지에 대한 등록과 실행 할 코드 구현
public class StudentBeforeAspect {
	//advice - pointcut을 분리
	@Pointcut("execution(* call*(..))")//call* 함수가 실행 될 경우
	public void xxx() {} //실제 공통 로직이 구현된 함수(Advice) -xxx()함수 실행 등록
	
	@Before("xxx()")
	public void callEchoBefore(JoinPoint point) {
		System.out.println("공통 로직 : " + point);
		System.out.println("공통 로직 : " + point.getSignature().getName());
		System.out.println("공통 로직 - callEchoBefore()");
	}
	
	
	//advice + pointcut을 같이 표현(한 메서드에서 모두 표현)
	@Before("execution(* say*(..))")
	public void sayEchoBefore(JoinPoint point) {
		System.out.println(point);
	}
 }
