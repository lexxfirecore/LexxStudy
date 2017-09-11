package com.lexx.threads;


public class MainThreadsChangeValue {

	public static void main(String[] args) {
		System.out.println("com.lexx.threads");

		ChangeValue cv = new ChangeValue(0);
		ThreadChangeValueIncrement ti = new ThreadChangeValueIncrement("TCVI1", cv);
		ThreadChangeValueIncrement ti2 = new ThreadChangeValueIncrement("TCVI2", cv);
		//ThreadChangeValueDecrement td = new ThreadChangeValueDecrement("TCVD", cv);
		
		ti.start();
		ti2.start();
		//td.start();
		
		
		try{
			ti.join();
			//td.join();
			ti2.join();
		} catch(Exception e){
			System.out.println("Interrupted");
		}
		
	}

}
