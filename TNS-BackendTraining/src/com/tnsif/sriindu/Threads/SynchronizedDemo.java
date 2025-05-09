package com.tnsif.sriindu.Threads;

public class SynchronizedDemo implements Runnable{
		synchronized public void run() {
			for(int i=0;i<5;i++) {
				System.out.println("Hello Iam"+Thread.currentThread().getName());
			}
		}
}
