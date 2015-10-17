package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;

public abstract class Vehicle implements Driveable {

    protected final EnergySource energySource;
    protected final Engine engine;
    protected final Gear gear;

    public Vehicle(EnergySource energySource, Engine engine, Gear gear) {
        this.energySource = energySource;
        this.engine = engine;
        this.gear = gear;
    }

}
