package org.example.strategyDesignPattern;

import org.example.strategyDesignPattern.strategy.SportDrive;

public class SportVehicle extends Vehicle {
    public SportVehicle() {
        super(new SportDrive());
    }
}
