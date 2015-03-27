package com.lexxstudy.exceptions;

import java.util.Stack;

public class Exception_Example {

	public static void main(String[] args) {
		Exception exc = new Exception("exceptie theta");
		try {

			Exception e = new Exception("demo exception", exc);
			StackTraceElement[] trc = new StackTraceElement[] { new StackTraceElement(
					"Main", "main()", "Main.java", 5) };
			e.setStackTrace(trc);
			throw e;

		} catch (Exception e) {

			System.out.println("exceptie:");
			System.out.println(e);

			System.out.println("message: " + e.getMessage());
			System.out.println("cause: " + e.getCause());
			System.out.println("trace: " + e.getStackTrace());
			System.out.println("e.toString(): " + e.toString());
			System.out.println("e.getSuppressed:" + e.getSuppressed());
			System.out.println("e.printStackTrace():");  e.printStackTrace();
			System.out.println("exception name: " + e.getClass().getSimpleName());
		}
	}

}
