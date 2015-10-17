package com.geekhub.hw2.partsImpl;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.Gear;


public class Transmission implements Gear {
    final int KKD;

    public Transmission(int kkd) {
        this.KKD = kkd;
    }

    @Override
    public void consume(Force force) {
        System.out.println("move " + force.getAmount() / KKD + "m");
    }
}
