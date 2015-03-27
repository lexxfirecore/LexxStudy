package com.lexxstudy.javabrains.spring14.lifecycle_callbacks;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements InitializingBean, DisposableBean{
	private Point pointA ;
	private Point pointB ; 
	private Point pointC ;
		
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw(){
				
		System.out.println("PointA = (" +  getPointA().getX() + ", " + getPointA().getY() + ")");
		System.out.println("PointB = (" +  getPointB().getX() + ", " + getPointB().getY() + ")");
		System.out.println("PointC = (" +  getPointC().getX() + ", " + getPointC().getY() + ")");
	
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called for Triangle");
		System.out.println("...this method runs before all beans creations");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DispozableBean destroy method called for Triangle");
		System.out.println("...here goes all cleaning and dispose code");
		
	}

	

}
