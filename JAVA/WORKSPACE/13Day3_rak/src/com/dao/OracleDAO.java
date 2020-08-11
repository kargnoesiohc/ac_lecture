package com.dao;

import java.util.HashSet;

public class OracleDAO {
				public HashSet<Person> select() {
						HashSet<Person> set = new HashSet<Person>();
						set.add(new Person("홍길동",20,"서울"));
						return set;
		}

}
