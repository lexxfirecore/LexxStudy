package com.lexxstudy.javabrains.spring11.understanding_bean_scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main11 {

	public static void main(String[] args) {
	
		System.out.println("Spring 11");
		System.out.println("Describes Spring application scopes: Singletone(default - same bean is used by all) vs Prototype (every time a new bean is created)");
		System.out.println("also web-aware scopes: Request, Session and Global Session");

	}

}
