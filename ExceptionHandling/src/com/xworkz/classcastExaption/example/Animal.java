package com.xworkz.classcastExaption.example;

public class Animal {

	String color;

	public Animal(String color) {
		this.color = color;
	}

	void eat(String name) {
		System.out.println(name + " is eating .....");
	}

	void show(String name) {
		System.out.println(name + " is of " + color + " Color");
	}
}
