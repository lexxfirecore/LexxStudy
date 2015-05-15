package com.lexxstudy.spring_aop.aop;

import com.lexxstudy.spring_aop.common.AmplifierService;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by lexxfirecore on 5/15/2015.
 */

public class AfterAdviser implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("********* after executing method **************");
        System.out.println("Called method: " + method.getName());

        System.out.println("object o: " + target);
        if ( target instanceof AmplifierService) {
            System.out.println("Amplifier value AfterAdviser changes: " + ((AmplifierService) target).getAmplifier().toString());
        }
    }
}
