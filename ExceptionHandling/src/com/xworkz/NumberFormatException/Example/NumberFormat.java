package com.xworkz.NumberFormatException.Example;

public class NumberFormat {

	public static void main(String[] args) {
		try {
		int num = Integer.parseInt("abs");
		System.out.println("The number is " +num);
		}catch(Exception e) {
			System.out.println("enter proper input");
			
		}

	}

}
