package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
@Aspect
public class LogAspect {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Pointcut("within(@org.springframework.stereotype.Component *)")
    public void component() {
    }

    @Pointcut("execution(* com.example.demo.resource.MyResource.*(..))")
    public void myResourceMethods() {
    }

    @AfterThrowing(pointcut = "myResourceMethods()", throwing = "exception")
    private void entering(JoinPoint joinPoint, Throwable exception) {
        //log.info("Throwing an exception for this method: " + joinPoint.getSignature().getName());
        log.info("Entering in Method :  " + joinPoint.getSignature().getName());
        log.info("Class Name :  " + joinPoint.getSignature().getDeclaringTypeName());
        log.info("Arguments :  " + Arrays.toString(joinPoint.getArgs()));
        log.info("Target class : " + joinPoint.getTarget().getClass().getName());
        log.error("Cause : " + exception.getCause());
    }
}
