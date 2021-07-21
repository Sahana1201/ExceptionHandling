package com.xworkz.classcastExaption.example;

public class AnimalTester {

	public static void main(String[] args) {

		Animal animal = new Animal("White");
		Dog dog1 = new Dog("black");
		Animal dog3 = (Dog) animal; //upcasting 

		animal.show("Fluffy");
		animal.color = "black";
		animal.eat("meat");

		Animal animal1 = new Animal("White");
		try {
			Dog d = (Dog) animal1;
			d.color = "black";
			d.eat("bread");
			d.walking();
		} catch (Exception e) {
			System.out.println(" end ");
		}

	}

}
