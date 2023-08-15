package org.example;

import org.example.strategyDesignPattern.PassengerVehicle;
import org.example.strategyDesignPattern.SportVehicle;
import org.example.strategyDesignPattern.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportVehicle();
        vehicle.drive();
        vehicle = new PassengerVehicle();
        vehicle.drive();
        System.out.println("Hello world!");
    }
}