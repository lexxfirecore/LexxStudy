package com.lexxstudy.javabrains.spring06.using_constructor_injection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main06 {

	public static void main(String[] args) {
		System.out.println("Spring 06");
		ApplicationContext context = new ClassPathXmlApplicationContext("triangle06.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();

	}

}
