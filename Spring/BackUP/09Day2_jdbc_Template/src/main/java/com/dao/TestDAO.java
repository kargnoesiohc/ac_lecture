package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.dto.TestDTO;

@Repository
public class TestDAO {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public TestDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<TestDTO> select() {
		List<TestDTO> list = jdbcTemplate.query("select * from test", 
				new RowMapper<TestDTO>() { //RowMApper, mapRow 함수 오버라이딩
					public TestDTO mapRow(ResultSet rs, int roNum) throws SQLException {
						TestDTO dto = new TestDTO();
						dto.setNum(rs.getInt(1));
						dto.setUsername(rs.getString(2));
						dto.setAddress(rs.getString(3));
						
						return dto;
					}
				});// end List<TestDTO> list;
		return list;
	} //end select()
	
	public List<TestDTO> selectByName(String name) {
		List<TestDTO> list = jdbcTemplate.query("select * from test where username = ?", 
				new RowMapper<TestDTO>() { //RowMApper, mapRow 함수 오버라이딩
					public TestDTO mapRow(ResultSet rs, int roNum) throws SQLException {
						TestDTO dto = new TestDTO();
						dto.setNum(rs.getInt(1));
						dto.setUsername(rs.getString(2));
						dto.setAddress(rs.getString(3));
						
						return dto;
					}
				}, name);// end List<TestDTO> list;
		return list;
	} //end selectByName()
	
	public void insert(int num, String name, String address) {
		jdbcTemplate.update("insert into test (num, username, address) values(?,?,?)", num, name, address);
	}//end insert()
}
