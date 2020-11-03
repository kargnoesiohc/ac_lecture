package com.aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("aspect")
public class PersonBeforeAscept {
	public void getBefore() {
		System.out.println("getBefore()");
	}
	
	public void mesgAfter() {
		System.out.println("mesgAfter()");
	}
}
 