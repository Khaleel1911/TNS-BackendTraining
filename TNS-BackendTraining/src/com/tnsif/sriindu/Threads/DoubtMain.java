package com.tnsif.sriindu.Threads;

public class DoubtMain {

	public static void main(String[] args) throws InterruptedException {
		Doubt d=new Doubt(5);
		Doubt d2=new Doubt(2);
		
		Thread t1=new Thread(d);
		Thread t2=new Thread(d2);
		
		t1.start();
		t1.join();
		t2.start();

	}

}
