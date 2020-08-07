package com.dao;

public class MySQLDAO implements Dao{

		@Override
		public void connectDB() {
//			mysql db접속하여 사용하는 메소드				
				System.out.println(("MySQLDAO.connect"));
		}

		@Override
		public void insertDB() {
				// TODO Auto-generated method stub
				System.out.println(("MySQLDAO.insert"));

		}
}

