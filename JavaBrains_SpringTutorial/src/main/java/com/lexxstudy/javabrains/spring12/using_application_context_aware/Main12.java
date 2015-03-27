package com.lexxstudy.javabrains.spring12.using_application_context_aware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main12 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("triangle12.xml");
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		System.out.println("Spring 12");
		triangle.draw();

	}

}
