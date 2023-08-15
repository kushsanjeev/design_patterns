package org.example.strategyDesignPattern;

import org.example.strategyDesignPattern.Vehicle;
import org.example.strategyDesignPattern.strategy.DriveStrategy;
import org.example.strategyDesignPattern.strategy.SportDrive;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new SportDrive());
    }
}
