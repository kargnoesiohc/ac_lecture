package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.dao.DeptDAO;


public class DeptService {
	
	@Autowired(required = false)
	private DeptDAO dao;
	@Value("${jdbc.driver}")
	private String driver;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.xxx}")
	private String xxx;

	
//	public void setDriver(String driver) { this.driver = driver; }
//	public void setUrl(String url) { this.url = url; }
//	public void setUsername(String username) { this.username = username; }
//	public void setXxx(String xxx) { this.xxx = xxx; }
	
	public DeptService() {
		// TODO Auto-generated constructor stub
	}
	

	public DeptService(String driver, String url, String username, String xxx) {
	super();
	this.driver = driver;
	this.url = url;
	this.username = username;
	this.xxx = xxx;
}


	@Override
	public String toString() {
		return "DeptService [driver=" + driver + ", url=" + url + ", username=" + username + ", xxx=" + xxx +  "]";
	}


	public List<String> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}
	
	
}
