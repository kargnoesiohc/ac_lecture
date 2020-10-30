package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDAO;
import com.entity.OrderDTO;
import com.entity.ProductDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service
public class ProductService {
	@Autowired
	private ProductDAO dao;
	
	public List<ProductDTO> selectProduct() {
		return dao.selectProduct();
	} // end selectProduct();
	
	public List<OrderDTO> selectOrder() {
		return dao.selectOrder();
	}

	@Transactional
	public void addOrder(String pcode, int quantity) throws Exception {
		// TODO Auto-generated method stub
		dao.addOrder(pcode, quantity);
		
	}
}
