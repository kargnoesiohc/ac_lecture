package com.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component("ascept")
public class PersonBeforeAscept {
	@Before("execution(* get*(..))")
	public void getBefore() {
		System.out.println("getBefore()");
	}

	@After("execution(* mesg*(..))")
	public void mesgAfter() {
		System.out.println("mesgAfter()");

	}
}
