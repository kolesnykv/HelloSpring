package com.knubisoft.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Performer performer = context.getBean("poeticDuke", Performer.class);
        performer.perform();
    }


}
