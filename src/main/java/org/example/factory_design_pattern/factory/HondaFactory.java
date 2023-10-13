package org.example.factory_design_pattern.factory;

import org.example.factory_design_pattern.*;

public class HondaFactory extends VehicleFactory{

    public Vehicle createVehicle(String vehicleType){

        switch (vehicleType){
            case "CAR" : return new HondaCar();

            case "BIKE" : return new HondaBike();

            default: return null;
        }
    }
}
