package com.knubisoft.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        uniLibrary.getBook();
        uniLibrary.getMagazine();
        schoolLibrary.getBook();
        schoolLibrary.returnBook();
        context.close();

    }
}
