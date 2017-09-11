package spring_aop.common;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lexxfirecore on 5/15/2015.
 */

public class MainControl {

    public static void main(String[] args) {

        //  create an application context container object from xml by classpath
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");


        // ******************* Spring *******************

        //  get amplifier and amplifier service beans from application context
        Amplifier amplifier = (Amplifier) applicationContext.getBean("amplifier");
        AmplifierService amplifierService = (AmplifierService) applicationContext.getBean("amplifierService");

        System.out.println("Main: Amplifier object initial values: " + amplifier.toString());

        // setting the default values in amplifier object from service
        amplifierService.setDefaultSettings();
        System.out.println("Amplifier object values changed by amplifierService.setDefaultSettings(): " + amplifier.toString());

        // changing volume +10
        amplifierService.raiseVolume(10);
        // changing gain -7
        amplifierService.reduceGain(7);
        System.out.println("Amplifier value after changes of volume with + 10 and gain with - 7: " + amplifier.toString());


        // ****************** Spring AOP *****************

        // getting proxy bean to amplifierService bean from application context
        AmplifierService amplifierServiceProxy = (AmplifierService) applicationContext.getBean("amplifierServiceProxy");

        System.out.println("Main: Before running method amplifierServiceProxy.raiseVolume(49): ");
        amplifierServiceProxy.raiseVolume(49);
        System.out.println("Main: After running method amplifierServiceProxy.raiseVolume(49): ");

    }

}
