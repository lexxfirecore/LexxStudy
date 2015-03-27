package com.lexxstudy.javabrains.spring13.bean_definition_inheritance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main13 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("triangle13.xml");
		
		System.out.println("Spring 13");
		
		Triangle triangle1 = (Triangle) context.getBean("triangle1");
		System.out.println("triangle1 have pointB and pointC and inherits pointA from parenttriangle bean");
		triangle1.draw();
		
		Triangle triangle2 = (Triangle) context.getBean("triangle2");
		System.out.println("triangle2 have pointB and inherits pointA from parenttriangle bean but has no pointC defined and generates exception");
		triangle2.draw();
		
	}

}
