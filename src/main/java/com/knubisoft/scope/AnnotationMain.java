package com.knubisoft.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Music music = applicationContext.getBean("rockMusic", Music.class);
        System.out.println(music.getSong());

    }
}
