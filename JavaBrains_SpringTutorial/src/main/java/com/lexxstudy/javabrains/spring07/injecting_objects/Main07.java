package com.lexxstudy.javabrains.spring07.injecting_objects;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main07 {

	public static void main(String[] args) {
		System.out.println("Spring 07");
		ApplicationContext context = new ClassPathXmlApplicationContext("triangle07.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();

	}

}
