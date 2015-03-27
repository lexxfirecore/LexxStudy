package com.lexxstudy.javabrains.spring09.initializing_collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main09 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("triangle09.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		System.out.println("Spring 09");
		triangle.draw();

	}

}
