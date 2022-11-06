package com.knubisoft.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println(String.format("We take a book from %s", this.getClass().getSimpleName()));
    }

}
