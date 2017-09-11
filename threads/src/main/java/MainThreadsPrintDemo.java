package com.lexx.threads;


public class MainThreadsPrintDemo {

	public static void main(String[] args) {
		System.out.println("com.lexx.threads");
		
		PrintDemo pd = new PrintDemo();
		
		ThreadPrintDemo t1 = new ThreadPrintDemo("Thread - 1 ", pd);
		ThreadPrintDemo t2 = new ThreadPrintDemo("Thread - 2 ", pd);
		
		t1.start();
		t2.start();
		
		try{
			t1.join();
			t2.join();
		} catch(Exception e){
			System.out.println("Interrupted");
		}
		
	}

}
