package com.dao;

import java.util.Arrays;
import java.util.List;

public class DeptDAO {
	public List<String> list() {
		return Arrays.asList("홍길동", "이순신", "유관순"); //배열을 ArrayList로 변환
	}
}