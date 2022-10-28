package com.knubisoft.scope;

public class ClassicalMusic implements Music {

    public void doMyInit() {
        System.out.println("Initialization....");
    }
    public void doMyDestroy() {
        System.out.println("Destroying...");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
