package com.lexx.annotation.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationParsing {

	public static void parseAll() {
		try{
			for(Field method : AnnotationParsing.class
					.getClassLoader()
					.loadClass(("annotation.ClassWithAnnotatedMethods"))
					.getFields()){
				if (method
						.isAnnotationPresent(com.lexx.annotation.annotation.CustomAnnotation.class)){
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
