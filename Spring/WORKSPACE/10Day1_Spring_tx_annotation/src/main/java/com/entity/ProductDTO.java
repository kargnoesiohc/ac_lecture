package com.entity;

import lombok.Data;

/*
 *  create table t_product
   ( pcode  varchar2(10) primary key,
     pname varchar2(10),
     price number(4),
     quantity number(4) );
 */

@Data
public class ProductDTO {

	private String pcode;
	private String pname;
	private int price;
	private int quantity;
	
	
	
	
}
