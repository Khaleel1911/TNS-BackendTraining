package com.tnsif.sriindu.Threads;
public class ThreadComm {
	
	int i;
	boolean flag=false;
	
	synchronized void deliver() {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.i=i;
		flag=true;
		System.out.println("Data delievered"+ i);
		notify();
		
	}
	
	synchronized int receive() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Data received"+ i++);
		flag=false;
		notify();
		return i;
	}
	
}

