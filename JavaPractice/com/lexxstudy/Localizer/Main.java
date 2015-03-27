package com.lexxstudy.Localizer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ch.qos.logback.core.Context;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext("com.lexxstudy");
		Print p = ctx.getBean(Print.class);
		p.Write();
		
		Triangle t = ctx.getBean(Triangle.class);
		System.out.println(t.getPointA().getXY());
		
	}

}
