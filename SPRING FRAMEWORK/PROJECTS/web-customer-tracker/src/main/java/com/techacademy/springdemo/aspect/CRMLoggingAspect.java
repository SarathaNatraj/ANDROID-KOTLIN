package com.techacademy.springdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class CRMLoggingAspect {

    // setup logger
    private Logger myLogger = Logger.getLogger(getClass().getName());

    //setup pointcut declarations
    @Pointcut("execution(* com.techacademy.springdemo.controller.*.*(..))")
    private void forControllerPackage() {
        myLogger.info("======>>> in @Pointcut : forControllerPackage: ");


    }

    // do the same for server and dao
    @Pointcut("execution(* com.techacademy.springdemo.service.*.*(..))")
    private void forServicePackage() {

    }

    @Pointcut("execution(* com.techacademy.springdemo.dao.*.*(..))")
    private void forDaoPackage() {

    }

    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
    private void forAppFlow() {

    }

    //Add @Before advice
    @Before("forAppFlow()")
    public void before(JoinPoint theJoinPoint) {

        // display method we are calling
    	myLogger.info("####### "+theJoinPoint);
        String theMethod = theJoinPoint.getSignature().toShortString();
        myLogger.info("======>>> in @Before: calling method: " + theMethod);

        // display the argument tp the method

        // get the arguments
        Object[] args = theJoinPoint.getArgs();

        // loop thru and display args
        for (Object tempArg : args) {
            myLogger.info("@@@@@@@argument: " + tempArg);
        }


    }
    //Add @AfterReturning advice

    @AfterReturning(
            pointcut = "forAppFlow()",
            returning = "theResult"
    )
    public void afterReturning(JoinPoint theJoinPoint, Object theResult) {

        // display method we are returning from
        String theMethod = theJoinPoint.getSignature().toShortString();
        myLogger.info("======>>> in @AfterReturning: from method: " + theMethod);

        // display data return
        myLogger.info("**************>>> result: " + theResult);


    }
    
   // @AfterThrowing()
}


