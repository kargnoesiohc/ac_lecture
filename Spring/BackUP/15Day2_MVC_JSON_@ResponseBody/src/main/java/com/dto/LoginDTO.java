package com.dto;

import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Repository
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class LoginDTO {
	private String userid;
	private String passwd;
}
