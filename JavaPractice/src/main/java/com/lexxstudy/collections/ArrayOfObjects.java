package com.lexxstudy.collections;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class ArrayOfObjects {

	 
	
	public static void main(String[] args) {
		Rectangle rectangleArray[] = {new Rectangle(10,20), new Rectangle(5,9), new Rectangle(25,3)};
		
		System.out.println(rectangleArray.getClass().getSimpleName());
		for (int i = 0; i < rectangleArray.length; i++) {
			System.out.println(rectangleArray[i]);
		}

		List<Rectangle> rectangleArrayList = new ArrayList<Rectangle>();
		rectangleArrayList.add(new Rectangle(15,30));
		rectangleArrayList.add(new Rectangle(24,44));
		rectangleArrayList.add(new Rectangle(5,4,55,54));
		rectangleArrayList.add(new Rectangle(1,2));
		
		System.out.println(rectangleArrayList.getClass().getSimpleName());
		for (Rectangle rectangle : rectangleArrayList) {
			System.out.println(rectangle);
		}
		
		
		
	}

}
