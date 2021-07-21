package com.xworkz.multiplemethodcalling.example;

public class MultipleMethodCalling {

	void m1() {
		System.out.println("start m1");
		try {
			m2();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("end m1");
	}

	void m2() {
		System.out.println("start m2");
		try {
			m3();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		System.out.println("end m2");
	}

	void m3() {
		System.out.println("start m3");
		try {
			String name = "sahana";
			name.length();
			System.out.println("value of name: " + name);

		} catch (NullPointerException e) {
			e.printStackTrace();

		}
		System.out.println("end m3");

	}

	public static void main(String[] args) {
		System.out.println("main starting");

		MultipleMethodCalling mc = new MultipleMethodCalling();
		mc.m1();
		System.out.println("end main");

	}

}
