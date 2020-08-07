package com.pet;

public class TestPet {

	public static void main(String[] args) {
		//다형성
		Movement [] move = new Movement[] {
						new Cat("나비", 3, "암컷"),
						new Dog("하루", 2, "블랙"),
						new Fish("이틀",3,10.3),
		};
		for(Movement m: move) {
				System.out.println(m);
		}
	}

}
