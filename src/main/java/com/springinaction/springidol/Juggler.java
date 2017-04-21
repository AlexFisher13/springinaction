package com.springinaction.springidol;

/**
 * Created by Tkachenko on 21.04.2017.
 */
public class Juggler implements Performer {

    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void perform() {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}
