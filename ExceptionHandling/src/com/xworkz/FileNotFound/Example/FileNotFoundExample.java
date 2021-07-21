package com.xworkz.FileNotFound.Example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExample {

	public static void main(String[] args) throws Throwable {
		System.out.println("Begining of main Program");
		FileNotFoundExample filenotfound = new FileNotFoundExample();
		try {
			filenotfound.readFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("file not found");
		}

		System.out.println("End of main program");

	}

	private void readFile() throws Throwable {
		System.out.println("In method");
		FileReader in = null;
		try {

			File f = new File("C:\\21TRANS05\\eclipse\\workspace\\ExceptionHandling\\src\\com\\xworkz\\FileNotFound\\Example\\hello.txt");
			in = new FileReader(f);
			System.out.println("file found");
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} // catch (IOException e) {
			// e.printStackTrace();
			// }
		finally {
			// in.close();
		}
		System.out.println("found the file");
		System.out.println("End of method");
	}

}
