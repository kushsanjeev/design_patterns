package org.example.strategyDesignPattern.strategy;

public class SportDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports drive strategy");
    }
}
