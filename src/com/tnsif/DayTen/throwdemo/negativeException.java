package com.tnsif.DayTen.throwdemo;

public class negativeException extends Exception{

	public negativeException(String string) {
		super(string);
	}
	
	public negativeException() {
		super("negative value exception");
	}
	

}