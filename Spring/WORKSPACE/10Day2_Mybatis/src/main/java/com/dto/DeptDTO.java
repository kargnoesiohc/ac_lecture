package com.dto;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("Dept") //Mapper에서 사용하는 Model Class alias를 어노테이션으로 설정
@Data
public class DeptDTO {
	private int deptno;
	private String dname;
	private String loc;
}
