package com.geekhub.hw2;

import com.geekhub.hw2.partsImpl.*;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Driveable;
import com.geekhub.hw2.vehicle.Vehicle;
import com.geekhub.hw2.venicleImpl.Boat;
import com.geekhub.hw2.venicleImpl.Car;
import com.geekhub.hw2.venicleImpl.SolarCar;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Boat(new Tank(100), new FuelEngine(423), new Transmission(95)),
                new Car(new Tank(40), new FuelEngine(500), new Transmission(70)),
                new SolarCar(new Battery(30), new SolarEngine(300), new Transmission(70))
        };

        for (int i = 0; i < vehicles.length; i++) {
            testDrive(vehicles[i]);
            System.out.println();
        }

    }

    private static void testDrive(Driveable driveable) {
        driveable.accelerate();
        driveable.turn(Direction.LEFT);
        driveable.turn(Direction.RIGHT);
        driveable.brake();
        driveable.accelerate();
        driveable.brake();
    }
}
