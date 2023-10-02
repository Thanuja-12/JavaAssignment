package com.tnsif.DayTen.throwdemo;

import java.util.Scanner;

public class UsingThrow {
	static void acceptNumber() throws negativeException, greaterValueException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		try {
			if (n < 0)
				throw new negativeException();
			else if (n > 100)
				throw new greaterValueException("Percentage should not be greater than 100");
			else
				System.out.println("Valid Percentage");
			System.exit(0);
		} catch (negativeException |greaterValueException ae) {
			System.err.println("error..." + ae.getMessage());
		
	}
	}

	public static void main(String[] args) throws negativeException, greaterValueException  {
		
		System.out.println("Enter your percentage..");
		acceptNumber();

	}

}

