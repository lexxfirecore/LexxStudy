package com.lexxstudy.javabrains.spring05.application_context_and_property_initialization;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main05 {

	public static void main(String[] args) {
		System.out.println("Spring 05");
		ApplicationContext context = new ClassPathXmlApplicationContext("triangle05.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();

	}

}
