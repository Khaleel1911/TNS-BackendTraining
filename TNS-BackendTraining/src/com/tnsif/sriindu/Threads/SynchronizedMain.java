package com.tnsif.sriindu.Threads;

public class SynchronizedMain {
    public static void main(String[] args) {
        SynchronizedDemo demo = new SynchronizedDemo();  // Shared instance

        Thread t1 = new Thread(demo, "Thread-1");
        Thread t2 = new Thread(demo, "Thread-2");
        Thread t3 = new Thread(demo, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
