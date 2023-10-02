package com.tnsif.DayTen.interthreadcommunication;

public class Producer extends Thread{
	Queue obj;

	public Producer(Queue obj) {
		
		this.obj = obj;
		start();
	}
	
public void run()
{
	  int i=0;
	  while(true)
	  {
		  try
		  {
			  Thread.sleep(3000);
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		  obj.put(i);
		  i++;
	  }
}
}
