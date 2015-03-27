package com.lexxstudy.threads;

public class PrintDemo {
	public static void printCount() {		
		    try {
		         for(int i = 5; i > 0; i--) {
		            System.out.println("Counter   ---   "  + i );
		         }
		     } catch (Exception e) {
		         System.out.println("Thread  interrupted.");
		     }
		   
	}
	
}
