package com.geekhub.hw2.partsImpl;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.Engine;


public class FuelEngine implements Engine {


    final int POWER;

    public FuelEngine(int power) {
        this.POWER = power;
    }

    @Override
    public Force transform(Energy energy) {
        if (energy.getAmount() > 0) {
            return new Force(POWER * energy.getAmount());
        } else return new Force(0);
    }
}
