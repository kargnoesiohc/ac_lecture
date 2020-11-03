package com.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 하나의 레코드 저장
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class TestDTO  {

	int num;
	String username;
	String address;
}
