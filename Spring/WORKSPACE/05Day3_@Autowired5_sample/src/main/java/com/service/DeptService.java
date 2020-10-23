package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DeptDAO;


public class DeptService {
	
	@Autowired(required = false)
	private DeptDAO dao;
	private String driver;
	private String url;
	private String username;
	private String xxx;

	
	public void setDriver(String driver) { this.driver = driver; }
	public void setUrl(String url) { this.url = url; }
	public void setUsername(String username) { this.username = username; }
	public void setXxx(String xxx) { this.xxx = xxx; }

	@Override
	public String toString() {
		return "DeptService [driver=" + driver + ", url=" + url + ", username=" + username + ", xxx=" + xxx +  "]";
	}


	public List<String> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}
	
	
}
