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

                /* in loc de docs :)
        o clasa amplifier si un service in care se injecteaza amplifier prin setter
[17:27:59] Lexx: service schimba valorile din amplifier
[17:28:26] Lexx: un aspect care face un proxy la service si citeste metodele apelate
[17:28:51] Lexx: aspectul bean si proxy se declara tot in context
[17:29:25] Lexx: in main chem proxy class de tip AmplifierService si chem ceva metode de la el
[17:30:02] Lexx: si in acest moment se executa aspectul care modifica modelul amplului
[17:30:04] Lexx: iaka asa
         */

    }

}
