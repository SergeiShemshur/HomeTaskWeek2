package com.geekhub.hw2.partsImpl;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.parts.EnergySource;


public class Battery implements EnergySource {
    int amount;

    public Battery(int amount) {
        this.amount = amount;
    }

    @Override
    public Energy get() {
        if (amount > 0) {
            int energyAmount = (int) ((Math.random() * amount));
            amount -= energyAmount;
            return new Energy(energyAmount);
        } else return new Energy(0);

    }
}
