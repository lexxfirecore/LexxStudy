package com.lexxstudy.spring_aop.aop;

import com.lexxstudy.spring_aop.common.AmplifierService;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by lexxfirecore on 5/15/2015.
 */

public class BeforeAdviser implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("********* before executing method **************");
        System.out.println("Called method: " + method.getName());

        System.out.println("object o: " + o);
        if ( o instanceof AmplifierService) {
            ((AmplifierService) o).setAmplifierModel("FIREBALL 100 E635");
        }

    }
}
