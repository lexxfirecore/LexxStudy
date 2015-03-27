package com.lexxstudy.javabrains.spring08.inner_beans_aliases_and_idref;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main08 {

	public static void main(String[] args) {
		System.out.println("Spring 08");
		ApplicationContext context = new ClassPathXmlApplicationContext("triangle08.xml");
		// we can use alias instead bean name
		Triangle triangle = (Triangle) context.getBean("triangle-alias");
		triangle.draw();

	}

}
