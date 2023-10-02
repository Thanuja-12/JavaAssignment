package com.tnsif.DayTen.runnabledemo;

public class RunnableDemo {
public static void main(String[] args) {
		
		
		
		Runnable r2=()->System.out.println("runnable with Lambda Expression");
		new Thread(r2).start();
		
	}

}
