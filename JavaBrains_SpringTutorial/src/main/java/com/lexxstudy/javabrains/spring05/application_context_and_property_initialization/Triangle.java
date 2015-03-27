package com.lexxstudy.javabrains.spring05.application_context_and_property_initialization;

public class Triangle {
	public String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void draw(){
		System.out.println("Spring 05");
		System.out.println(getType() + " triangle drawn");
	}

}
