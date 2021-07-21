package com.xworkz.ClassNotFound.Example;

public class ClassNotFoundExample {

	public static void main(String[] args) {

		try {
			Object obj = Class.forName("java.lang.Thread");
			System.out.println(obj);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("ClassNotFoundException caught");
		}

	}

}
