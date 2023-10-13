package org.example.factory_design_pattern;

public class Car implements Vehicle{

    @Override
    public float calculateMileage() {
        System.out.println("Car Mileage is 15.0 km/L");
        return 15.0f;
    }

    @Override
    public int getNumberOfWheels() {
        System.out.println("number of wheels in car 4");
        return 4;
    }
}
