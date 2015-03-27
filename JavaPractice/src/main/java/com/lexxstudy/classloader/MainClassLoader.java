package com.lexxstudy.classloader;

//Examine the way Class Loader Works

public class MainClassLoader {

	public static void main(String[] args) {

		System.out.println("main: method main");
		new Candy();
		System.out.println("main: print after Candy");
		
		try {
			System.out.println("main: Class.forName() =  " + Class.forName("com.lexxstudy.classloader.Gum"));
		} catch (ClassNotFoundException e) {
			System.out.println("main: Could't find Gum");

		}
		System.out.println("main: After Class.forName(\"Gum\")");
		
		new Cookie();
		System.out.println("main: print after Cookie");
		

	}
}
