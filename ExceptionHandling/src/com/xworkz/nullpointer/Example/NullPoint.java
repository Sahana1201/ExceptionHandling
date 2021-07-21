package com.xworkz.nullpointer.Example;

public class NullPoint {

	public static void main(String[] args) {
		String ptr = null;
		System.out.println(ptr);

		if (ptr.equals("gfg"))
			System.out.print("Same");
		else
			System.out.print("Not Same");
		

		try {
			if ("sah".equals("gfg"))
				System.out.print("Same");
			else
				System.out.print("Not Same");
		} catch (NullPointerException e) {
			
			System.out.print("NullPointerException Caught");
		}

	}
}