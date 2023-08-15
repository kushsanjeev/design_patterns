package org.example.strategyDesignPattern;

import org.example.strategyDesignPattern.strategy.DriveStrategy;
import org.example.strategyDesignPattern.strategy.NormalDrive;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
