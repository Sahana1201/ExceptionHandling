package com.xworkz.classcastExaption.example;

public class Dog extends Animal {

	Dog(String color) {
		super(color);

	}

	void eat(String name) {
		System.out.println(name + " is eating ....");
	}
	
	void walking() {
		System.out.println("dog is walking");
	}
}
