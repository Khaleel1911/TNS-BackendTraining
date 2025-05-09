package com.tnsif.sriindu.Threads;

public class RunnableDemo implements Runnable {
	String name;
	public RunnableDemo(String name) {
		this.name=name;
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(this.name);
		}
		
	}
		
}
