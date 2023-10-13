package org.example.factory_design_pattern.factory;

import org.example.factory_design_pattern.Bike;
import org.example.factory_design_pattern.Car;
import org.example.factory_design_pattern.Vehicle;

public class VehicleFactory {

    public Vehicle createVehicle(String vehicleType){

        switch (vehicleType){
            case "CAR" : return new Car();

            case "BIKE" : return new Bike();

            default: return null;
        }
    }
}
