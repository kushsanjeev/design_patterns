package org.example.factory_design_pattern.factory;

import java.util.Objects;

public class VehicleAbstractFactory {

    public VehicleFactory createFactory(String vehicleCompanyName){
        if(vehicleCompanyName.equalsIgnoreCase("honda")){
            return new HondaFactory();
        }else{
            return new BMWFactory();
        }
    }
}
