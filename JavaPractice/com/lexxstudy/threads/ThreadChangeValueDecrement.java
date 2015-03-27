package com.lexxstudy.threads;


public class ThreadChangeValueDecrement extends Thread {
	private Thread t;
	private String threadName;
	ChangeValue cv;
	
	public ThreadChangeValueDecrement(String name, ChangeValue cv) {
		this.threadName = name;
		this.cv = cv;
	}
		
	public void run() {		
		cv.decrement();		
		System.out.println("Thread " + threadName + " exiting.");	
	}
		
	public void start() {
		System.out.println("Starting " + threadName);
		if ( t == null ){
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
