package com.entity;

import lombok.Data;

/*
 *    create table t_order
   ( num number(4) primary key,
     pcode  varchar2(10) references t_product(pcode),
     quantity number(4) ); 
 */
@Data
public class OrderDTO {

	  int num;
	  String pcode;
	  int quantity;
	  
}
