package org.example.factory_design_pattern;

public class HondaBike extends Bike{

    @Override
    public float calculateMileage() {
        System.out.println("Honda Bike Mileage is 40.0 km/L");
        return 40.0f;
    }

    @Override
    public int getNumberOfWheels() {
        System.out.println("number of wheels in honda bike 2");
        return 2;
    }
}
