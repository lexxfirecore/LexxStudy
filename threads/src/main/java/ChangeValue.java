package com.lexx.threads;

public class ChangeValue {
	
	private int startValue;
	
	public ChangeValue(int startValue) {
		this.startValue = startValue;
	}
	public synchronized void increment() {
		for(int i=0; i<1000; i++){
			System.out.println("value in increment() method: " + startValue++);
		}

	}
		
	public synchronized void decrement() {
		for(int i=0; i<1000; i++){
			System.out.println("value in decrement() method: " + startValue--);
		}

	}		
		

}
