package com.tnsif.DayTen.throwdemo;

public class greaterValueException extends Exception {

	public greaterValueException(String string) {
		super(string);
	}

	public greaterValueException() {
		super("greaterValueException");
	}
	

}