package com.tnsif.sriindu.Threads;

public class ThreadMain {

	public static void main(String[] args) {
		
//		ThreadDemo thread=new ThreadDemo();
//		ThreadDemo thread2=new ThreadDemo();
//		thread.start();
//		thread2.start();
		
		RunnableDemo rd=new RunnableDemo("Thread 0");
		Thread t1=new Thread(rd);
		
		t1.start();
	}

}
