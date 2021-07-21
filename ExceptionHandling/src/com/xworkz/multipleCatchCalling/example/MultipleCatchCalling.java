package com.xworkz.multipleCatchCalling.example;

import java.util.Scanner;

public class MultipleCatchCalling {

	public static void main(String[] args) {
		System.out.println("program for division");
		System.out.println("Enter two numbers");
		Scanner scan = new Scanner(System.in);
		String ptr = "sahana";

		int divisor = scan.nextInt();
		int divident = scan.nextInt();

		try {
			int result = divident / divisor;

			System.out.println("The division of " + divisor + "/" + divident + "is:- " + result);

			int noOfCharInName = ptr.length();
			System.out.println("welcome" + ptr);
			System.out.println("No of charecters :" + noOfCharInName);
		} catch (ArithmeticException e) {
			System.out.println("Receive zero as a divisor enter a non-zero number");
		}

		catch (NullPointerException e) {
			System.out.println("enter non null value");
		}

		System.out.println("Remaining statements......");
		System.out.println("End of Program");

	}

}
