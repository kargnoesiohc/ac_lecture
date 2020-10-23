package com.dto;

import java.util.Map;
import java.util.Properties;

public class Student {

	private String name;
	private int age;
	private Map<String, Cat> mapCat;
	
	//전화번호 (key:value 모두 문자열)  HashMap과 큰 차이가 없지만, Properties 클래스는 파일 입출력을 지원한다.

	Properties phones;  

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Map<String, Cat> getMapCat() {
		return mapCat;
	}

	public void setMapCat(Map<String, Cat> mapCat) {
		this.mapCat = mapCat;
	}

	public Properties getPhones() {
		return phones;
	}

	public void setPhones(Properties phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", mapCat=" + mapCat + ", phones=" + phones + "]";
	}
	
 	
}
