package org.example.factory_design_pattern;

public class HondaCar extends Car{

    @Override
    public float calculateMileage() {
        System.out.println("Honda Car Mileage is 15.0 km/L");
        return 15.0f;
    }

    @Override
    public int getNumberOfWheels() {
        System.out.println("number of wheels in honda car 4");
        return 4;
    }
}
