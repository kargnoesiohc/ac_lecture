package com.dto;


import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class Student {
	
	private String name;
	private int age;
	private boolean ismarried;
	private float weight;
	
}
