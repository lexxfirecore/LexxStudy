package com.lexxstudy.spring_aop.common;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lexxfirecore on 5/15/2015.
 */

public class MainControl {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Amplifier amplifier = (Amplifier) applicationContext.getBean("amplifier");
        AmplifierService amplifierService = (AmplifierService) applicationContext.getBean("amplifierService");

        System.out.println("Amplifier initial values: " + amplifier.toString());
        amplifierService.setDefaultSettings();
        System.out.println("Amplifier value after reset: " + amplifier.toString());

        amplifierService.raiseVolume(10);
        amplifierService.reduceGain(7);
        System.out.println("Amplifier value after changes: " + amplifier.toString());

        AmplifierService amplifierServiceProxy = (AmplifierService) applicationContext.getBean("amplifierServiceProxy");

        amplifierServiceProxy.raiseVolume(50);
        amplifierServiceProxy.reduceGain(2);
        System.out.println("Amplifier value after aspect changes: " + amplifier.toString());

    }

}
