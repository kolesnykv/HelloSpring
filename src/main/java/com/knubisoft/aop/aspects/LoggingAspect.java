package com.knubisoft.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: try to get a book");
    }

    @Before("execution(public void get*())")
    public void beforeAnyGet(){
        System.out.println("beforeAnyGet in action!!!");
    }
}
