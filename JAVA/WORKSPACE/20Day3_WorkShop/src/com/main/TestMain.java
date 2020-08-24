package com.main;


import java.util.List;

import com.dto.DTO;
import com.service.Service;

public class TestMain {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Service service = new Service();
				
				List<DTO> list = service.selectNotAmount(new DTO(null,null,null,"SEOUL",null,0));
				for(DTO dto:list) {
						System.out.println(dto);
				}
		}

}
