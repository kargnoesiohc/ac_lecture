package com.dto;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// target  클래스 //핵심 로직 구현 클래스
@Component("stu")
public class Student {
 public String sayEcho() { //핵심로직
	 return "Hello";
 }
 public String callEcho() { //핵심로직
	 return "World";
 }
}
