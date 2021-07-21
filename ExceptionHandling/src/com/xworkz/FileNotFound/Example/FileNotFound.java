package com.xworkz.FileNotFound.Example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {

	public static void main(String[] args) {

		File f = new File(
				"C:\\21TRANS05\\eclipse\\workspace\\ExceptionHandling\\src\\com\\xworkz\\FileNotFound\\Example\\hello.txt");
		try {
			FileReader in = new FileReader(f);
			System.out.println("Found The File");
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound ");
		} finally { // it will be executed whether exception occurs or not
			System.out.println("finally block");
		}
		System.out.println("End of the Program");

	}

}
