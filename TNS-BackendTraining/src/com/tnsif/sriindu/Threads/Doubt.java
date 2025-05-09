package com.tnsif.sriindu.Threads;

public class Doubt implements Runnable {
	
	int n;
	public Doubt(int n) {
		this.n=n;
	}
	@Override
	synchronized public void run() {
		for(int i=0;i<n;i++) {
			System.out.println(n+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
