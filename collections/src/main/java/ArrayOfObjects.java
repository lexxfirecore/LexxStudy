package com.lexx.collections;

import com.lexx.Localizer.Point;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOfObjects {

	 
	
	public static void main(String[] args) {
		Rectangle rectangleArray[] = {new Rectangle(5,9), new Rectangle(25,3), new Rectangle(10,20)};
		
		System.out.println(rectangleArray.getClass().getSimpleName());
		for (int i = 0; i < rectangleArray.length; i++) {
			System.out.println(rectangleArray[i]);
		}

		List<Rectangle> rectangleArrayList = new ArrayList<Rectangle>();
		rectangleArrayList.addAll(Arrays.asList(rectangleArray));
		rectangleArrayList.add(new Rectangle(15,30));
		rectangleArrayList.add(new Rectangle(24,44));
		rectangleArrayList.add(new Rectangle(5,4,55,54));
		rectangleArrayList.add(new Rectangle(1, 2));

		
		System.out.println(rectangleArrayList.getClass().getSimpleName());
		for (Rectangle rectangle : rectangleArrayList) {
			System.out.println(rectangle);
		}

		List<Double> idsList = new ArrayList<Double>();
		idsList.add(5.0);
		idsList.add(25.0);
		System.out.println("idsList = " + idsList);
		for (Rectangle rectangle : rectangleArrayList) {
			if(idsList.contains(rectangle.getWidth())) {
				rectangle.setBounds(new Rectangle((int)rectangle.getWidth() * 1000 ,(int) rectangle.getHeight() * 1000));
			}
		}
		System.out.println("rectangleArrayList after change = " + rectangleArrayList);
		System.out.println("should contain (5000,9000) and (25000,3000)");


		
		
	}

}
