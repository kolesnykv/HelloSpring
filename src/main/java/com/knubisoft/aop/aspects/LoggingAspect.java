package com.knubisoft.aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void com.knubisoft.aop.UniLibrary.getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: try to get a book");
    }

    @Before("execution(public void get*())")
    public void beforeAnyGet(){
        System.out.println("beforeAnyGet in action!!!");
    }

    @After("execution(public void getBook())")
    public void afterGetBook() {
        System.out.println("afterGetBook: book got successful");
    }

}
