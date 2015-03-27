package com.lexxstudy.javabrains.spring01.dependency_injection;

public class Main01 {
	


	public static void main(String[] args) {
		
		System.out.println("Spring 01");
		Drawing d = new Drawing();
		
		d.setShape(new Shape());
		d.drawShape();
		
		d.setShape(new Circle());
		d.drawShape();
		
		d.setShape(new Triangle());
		d.drawShape();
	

	}

}
