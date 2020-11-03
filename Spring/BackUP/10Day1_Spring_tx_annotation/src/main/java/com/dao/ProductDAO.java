package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.entity.OrderDTO;
import com.entity.ProductDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Repository
public class ProductDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<ProductDTO> selectProduct() {
		String query = "select * from t_product order by pcode";
		return jdbcTemplate.query(query, new RowMapper<ProductDTO>() {
			@Override
			public ProductDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				ProductDTO dto = new ProductDTO();
				dto.setPcode(rs.getString("pcode"));
				dto.setPname(rs.getString("pname"));
				dto.setPrice(rs.getInt("price"));
				dto.setQuantity(rs.getInt("quantity"));
				System.out.println(dto);
				return dto;
			}
		});
	} // end selectProduct()
	
	
	public List<OrderDTO> selectOrder(){
		String query ="select * from t_order order by pcode";
		return jdbcTemplate.query(query, new RowMapper<OrderDTO>() {
			@Override
			public OrderDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				OrderDTO dto = new OrderDTO();
				dto.setNum(rs.getInt("num"));
				dto.setPcode(rs.getString("pcode"));
				dto.setQuantity(rs.getInt("quantity"));
				return dto;
			}
		});
	}


	public void addOrder(String pcode, int quantity) throws Exception{
		// TODO Auto-generated method stub
		String query1 = "update t_product set quantity = quantity - ? where pcode = ?";
		int n = jdbcTemplate.update(query1, quantity, pcode);
		//일부러 틀림
		String query2 = "insert into t_order(num, pcode, quantity) values (t_order_seq.nextval, ?, ?)";
		n += jdbcTemplate.update(query2,pcode, quantity);
		System.out.println(n);
	}
	
	//주문
}
