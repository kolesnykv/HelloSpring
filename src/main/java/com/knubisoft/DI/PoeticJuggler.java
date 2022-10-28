package com.knubisoft.DI;


public class PoeticJuggler extends Juggler {
    private Poem poem;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    public void perform() {
        super.perform();
        System.out.println("Poem \n __________________________________");
        poem.recite();
    }

}
