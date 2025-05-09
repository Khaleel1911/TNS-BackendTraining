package com.tnsif.sriindu.Threads;

public class ThreadMainM {
public static void main(String[] args) {
		ThreadComm tc=new ThreadComm();
		Thread1 t1=new Thread1(tc);
		Thread2 t2=new Thread2(tc);
		t1.start();
		t2.start();
}
}
