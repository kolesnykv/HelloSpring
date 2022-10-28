package com.knubisoft.DI;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Juggler implements Performer{

    private int beanBags = 3;
    @Override
    public void perform() {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");

    }
}
