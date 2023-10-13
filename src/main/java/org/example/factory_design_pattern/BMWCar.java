package org.example.factory_design_pattern;

public class BMWCar extends Car{
    @Override
    public float calculateMileage() {
        System.out.println("BMW Car Mileage is 15.0 km/L");
        return 15.0f;
    }

    @Override
    public int getNumberOfWheels() {
        System.out.println("number of wheels in bmw car 4");
        return 4;
    }
}
