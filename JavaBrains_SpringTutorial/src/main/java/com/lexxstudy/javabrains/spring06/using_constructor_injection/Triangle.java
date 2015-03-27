package com.lexxstudy.javabrains.spring06.using_constructor_injection;

public class Triangle {
	public String type;
	public int height;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Triangle(String type){
		this.type = type;
	}
	public Triangle(int height){
		this.height = height;
	}
	public Triangle(String type, int height){
		this.type = type;
		this.height = height;
	}
	public void draw(){
		System.out.println("Spring 06");
		System.out.println(type + " triangle drawn with constructor of height " + getHeight() );
	}

}
