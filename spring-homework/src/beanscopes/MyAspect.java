package beanscopes;

import org.aspectj.lang.JoinPoint;

public class MyAspect {

    public void beforeCall(JoinPoint joinPoint) {
        System.out.println("Method Name :" + joinPoint.getSignature().toShortString());
    }
}
