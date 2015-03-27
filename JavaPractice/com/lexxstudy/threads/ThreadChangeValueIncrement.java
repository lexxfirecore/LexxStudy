package com.lexxstudy.threads;


public class ThreadChangeValueIncrement extends Thread {
	private Thread t;
	private String threadName;
	ChangeValue cv;
	
	public ThreadChangeValueIncrement(String name, ChangeValue cv) {
		this.threadName = name;
		this.cv = cv;
	}
		
	public void run() {	
	/*	try {
			System.out.println("start sleeping");
			sleep(1);
			System.out.println("stop sleeping");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		cv.increment();			
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
