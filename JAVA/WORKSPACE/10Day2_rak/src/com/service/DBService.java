package com.service;

import com.dao.Dao;

public class DBService {
		Dao dao = null;
		//2.static으로 자신의 객체 생성(싱글톤 디자인 패턴)
		public static DBService service = new DBService();
		//3.생성한 객체를 가져갈 수 있는 static 메소드  생성(싱글톤 디자인 패턴)
		public static DBService getService() {
				return service;
		}
		//1. 생성자를 private로 제한(싱글톤 디자인 패턴)
		private DBService() {}
		public void setDao(Dao dao) {
				this.dao = dao;
				dao.connectDB();//실제 실행할dao클래스의 db접속 함수 호출
		}
		public void insert() {
				dao.insertDB();
		}

}
