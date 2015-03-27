package com.lexxstudy.javabrains.spring14.lifecycle_callbacks;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main14 {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("triangle14.xml");
		context.registerShutdownHook();
		
		System.out.println("Spring 14");
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	
	}

}
