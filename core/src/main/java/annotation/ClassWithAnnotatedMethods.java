package com.lexx.annotation.annotation;

public class ClassWithAnnotatedMethods {
	
//	@CustomAnnotation(getAnotationDrivenText = "a text")
	public String getAnotationDrivenText(){
		return "anno dr txt";
	};
	
	@CustomAnnotation(text = "a text")
	public String text;
}
