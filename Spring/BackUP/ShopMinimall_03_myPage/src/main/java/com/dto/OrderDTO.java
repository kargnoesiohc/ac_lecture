package com.dto;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import lombok.Data;

@Alias("OrderDTO")
@Data
@AllArgsConstructor
public class OrderDTO {
	int num;
	String userid;
	String gCode;
	String gName;
	int gPrice;
	String gSize;
	String gColor;
	int gAmount;
	String gImage;
	String orderName;
	String post;
	String addr1;
	String addr2;
	String phone;
	String payMethod;
	String orderday;
	
}
