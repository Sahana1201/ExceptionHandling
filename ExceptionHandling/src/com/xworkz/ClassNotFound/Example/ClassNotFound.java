package com.xworkz.ClassNotFound.Example;

public class ClassNotFound {

	public static void main(String[] args) {
		try {
			Object a = Class.forName("com.xworkz.ClassNotFound.Example");
			System.out.println(a);
			System.out.println("class found");

		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
		}
		System.out.println("end main");
	}
}
