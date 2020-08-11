package com.service;

import java.util.HashSet;

import com.dao.OracleDAO;
import com.dao.Person;

public class OracleService {
		OracleDAO dao;
		
		public OracleService() {
				dao = new OracleDAO();
		}
		public HashSet<Person> select() {
				HashSet<Person> xxx = dao.select();
				return xxx;
		}
}
