package com.geekhub.hw2.venicleImpl;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Vehicle;


public class Car extends Vehicle {

    public Car(EnergySource energySource, Engine engine, Gear gear) {
        super(energySource, engine, gear);
    }

    @Override
    public void accelerate() {
        System.out.print("car accelerate ");
        Force force = engine.transform(energySource.get());
        gear.consume(force);
    }

    @Override
    public void turn(Direction direction) {
        System.out.println("car is turning  " + direction.toString());
    }


    @Override
    public void brake() {
        System.out.println("car is stopping");
        Force force = engine.transform(new Energy(0));
    }
}
