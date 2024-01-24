package com.AOPPractice.AOPPrep;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(value = "execution(* com.AOPPractice.AOPPrep.*.*(..))" ,returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result){
        logger.info("{} Returned with : {}",joinPoint,result);
    }
    @AfterThrowing(value = "execution(String com.AOPPractice.AOPPrep.*.*(..))", throwing = "exception")
    public void lofAfterExceptionThrown(JoinPoint joinPoint, Object exception){
        logger.info("Exception {} returned with : {}",joinPoint, exception);
    }
    @After(value = "execution(String com.AOPPractice.AOPPrep.*.*(..))")
    public void logAfterAll(JoinPoint joinPoint){
        logger.info("After : {}",joinPoint);
    }
}
