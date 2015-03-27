package com.lexxstudy.javabrains.spring04.writing_code_using_the_bean_factory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class Main04 {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		System.out.println("Spring 04");

        String path = "JavaBrains_SpringTutorial/src/main/java/com/lexxstudy/javabrains/spring04/writing_code_using_the_bean_factory/";
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(path + "triangle04.xml"));
		Triangle triangle = (Triangle) factory.getBean("triangle");
		
		triangle.draw();

	}

}
