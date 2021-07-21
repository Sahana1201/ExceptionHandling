package com.xworkz.arrayoutofbound.exception.example;

import java.util.Scanner;

public class ArrayException {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("start of Program");
		System.out.print("Enter the number of elements you want to store: ");
		n = sc.nextInt();
		int[] array = new int[2];

		
		  try { System.out.println("Enter the elements of the array: ");
		  for (int i =0; i < n; i++) 
			  array[i] = sc.nextInt();
		  System.out.println("Array elements are: ");
		  for (int i = 0; i < n; i++)
		  System.out.println(array[i]);
		  
		  } catch (Exception e) {
		  System.out.println("enter array elements in given index"); }
		 

	/*	System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		System.out.println("Array elements are: ");
		for (int i = 0; i < n; i++)
			System.out.println(array[i]);
		System.out.println("End of program"); */
	}

}
