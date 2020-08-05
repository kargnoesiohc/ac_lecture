package com.pet;

public class TestPet {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				//다형성의 대표적인 예
				Pet [] pets = new Pet[] {
					new Cat("야옹이", 3, "암컷"),
					new Dog("멍멍이",7,"갈색"),
					new Fish("금붕어",5,140.2),
				};
				
				for(Pet pet:pets) {
						pet.cry();
						pet.eat();
						pet.sleep();
						
						
						if(pet instanceof Cat) {
								Cat c = (Cat)pet;
								System.out.println(c.getName());
								System.out.println(c.getAge());
							} else if(pet instanceof Dog) {
									Dog d = (Dog)pet;
									System.out.println(d.getName());
									System.out.println(d.getAge());
							} else if(pet instanceof Fish) {
									Fish f = (Fish)pet;
									System.out.println(f.getName());
									System.out.println(f.getAge());
							}
						}
				}
		}


