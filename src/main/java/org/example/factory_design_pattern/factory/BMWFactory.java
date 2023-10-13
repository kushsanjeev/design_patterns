package org.example.factory_design_pattern.factory;

import org.example.factory_design_pattern.*;

public class BMWFactory extends VehicleFactory{

    public Vehicle createVehicle(String vehicleType){

        switch (vehicleType){
            case "CAR" : return new BMWCar();

            case "BIKE" : return new BMWBike();

            default: return null;
        }
    }
}
