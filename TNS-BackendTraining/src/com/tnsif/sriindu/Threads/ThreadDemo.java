package com.tnsif.sriindu.Threads;

public class ThreadDemo extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Iam thread"+this.getName());
//			System.out.println();
		}
	}
}
