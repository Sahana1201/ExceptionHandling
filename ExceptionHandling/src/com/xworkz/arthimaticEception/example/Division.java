package com.xworkz.arthimaticEception.example;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		System.out.println("program for division");
		System.out.println("Enter two numbers");
		Scanner scan = new Scanner(System.in);
		int divisor = scan.nextInt();
		int divident = scan.nextInt();

		int result = divisor / divident;
		System.out.println("The division of " + divident + "/" + divisor + " is:-" + result);

		/*
		 * try { int result = divident / divisor; System.out.println("The division of "
		 * + divident + "/" + divisor + "is:- " + result); } catch (Exception e) {
		 * System.out.println("Receive zero as a divisor enter a non-zero number"); }
		 */

		System.out.println("Remaining statements......");
		System.out.println("End of Program");

	} 

}
