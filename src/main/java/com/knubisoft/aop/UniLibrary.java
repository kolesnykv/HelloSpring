package com.knubisoft.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{
    @Override
    public void getBook() {
        System.out.println(String.format("We take a book from %s", this.getClass().getSimpleName()));
    }
    public void getMagazine() {
        System.out.println(String.format("We take a magazine from %s", this.getClass().getSimpleName()));
    }
}
