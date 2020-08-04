package com.test;

class Employee{
		String name;
		int salary;
	
		public String getEmployee() {
				return name + " " +salary;
		}
		public Employee() {
				System.out.println("부모 기본 생성자 호출");
		} //default 생성자 필수
		public Employee(String name, int salary) {
				super();
				this.name = name;
				this.salary = salary;
				System.out.println("Employee 부모 생성자 호출");
		}
		
}

class Manager extends Employee{
		String depart;
		
		public String getDepart() {
				return depart;
		}
		
		public Manager(String name, int salary, String depart) {
				super();
				this.name = name;
				this.salary = salary;
				this.depart = depart;
				System.out.println("Manager 자식 생성자 호출");
		}
		public String getManager() {
				return super.name + " "+super.salary + " " + depart;
		}
}

public class inherit_Test {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Employee emp = new Employee("홍길동",20000);
				Manager mgr = new Manager("이순신",30000,"개발");
				System.out.println(emp.getEmployee());
				System.out.println(mgr.getManager());

				
 		}

}
