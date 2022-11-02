package com.knubisoft.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Library library = context.getBean("library", Library.class);
        library.getBook();
        library.getMagazine();
        context.close();

    }
}
