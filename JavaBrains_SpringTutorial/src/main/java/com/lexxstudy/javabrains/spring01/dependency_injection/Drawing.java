package com.lexxstudy.javabrains.spring01.dependency_injection;

public class Drawing {
	private Shape shape;

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void drawShape() {		
		if (shape != null)
			this.shape.draw();
		else 
			System.out.printf("the shape object doesn't exist\n");
	}
}
