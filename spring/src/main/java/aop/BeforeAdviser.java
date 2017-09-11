package aop;

import spring_aop.common.AmplifierService;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by lexxfirecore on 5/15/2015.
 */

public class BeforeAdviser implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object target) throws Throwable {

        System.out.println(this.getClass().getSimpleName() + ": Running aspect: " + this.getClass().getName());
        System.out.println(this.getClass().getSimpleName() + ": Aspect detected call of method: method.getName() = " + method.getName() +
                ", with args: " + Arrays.asList(args) +
                " and target object: " + target);

        if (target instanceof AmplifierService) {
            System.out.println(this.getClass().getSimpleName() + ": Amplifier value BeforeAdviser changes: " + ((AmplifierService) target).getAmplifier().toString());
        }

    }
}
