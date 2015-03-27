package com.lexxstudy.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotationParsing {

	public static void parseAll() {
		try{
			for(Field method : AnnotationParsing.class
					.getClassLoader()
					.loadClass(("com.lexxstudy.annotation.ClassWithAnnotatedMethods"))
					.getFields()){
				if (method
						.isAnnotationPresent(com.lexxstudy.annotation.CustomAnnotation.class)){
					for(Annotation anno : method.getDeclaredAnnotations()){
						System.out.println("Annotation in Method " + method + ":" + anno);
					}
					
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
	}
}
