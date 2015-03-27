package com.lexxstudy.javabrains.spring04.writing_code_using_the_bean_factory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.util.StringUtils;

import java.io.File;
import java.net.URL;


public class Main04 {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		System.out.println("Spring 04");

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(getPath() + "triangle04.xml"));
		Triangle triangle = (Triangle) factory.getBean("triangle");
		
		triangle.draw();

	}

    private static String getPath() {
        URL location = Main04.class.getProtectionDomain().getCodeSource().getLocation();
        String pathPrefix = location.getPath().replace("/target/classes","");
        String pathSuffix = Main04.class.getPackage().getName().replace(".","/");
        return pathPrefix + "src/main/java/" + pathSuffix + "/";
    }

}
