package com.lexx.threads;


public class ThreadPrintDemo extends Thread {
	private Thread t;
	private String threadName;
	PrintDemo pd;
	
	public ThreadPrintDemo(String name, PrintDemo pd) {
		this.threadName = name;
		this.pd = pd;
	}
		
	public void run() {
		synchronized (pd) {
			pd.printCount();			
		}
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
