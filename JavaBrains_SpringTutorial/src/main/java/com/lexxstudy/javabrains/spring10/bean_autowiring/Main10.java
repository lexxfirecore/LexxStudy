package com.lexxstudy.javabrains.spring10.bean_autowiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main10 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("triangle10.xml");
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		System.out.println("Spring 10");
		System.out.println("Autowire will find class properties by name, type or constructor which will match with propeties defined in XML.");
		triangle.draw();

	}

}
