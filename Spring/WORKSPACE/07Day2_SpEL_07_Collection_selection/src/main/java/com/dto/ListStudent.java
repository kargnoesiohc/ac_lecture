package com.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class ListStudent {
	List<Student> list;
	
	
	public List<Student> getList() {
		return list;
	}
}
