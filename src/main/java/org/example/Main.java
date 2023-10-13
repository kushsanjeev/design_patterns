package org.example;

import org.example.factory_design_pattern.Vehicle;
import org.example.factory_design_pattern.factory.VehicleAbstractFactory;
import org.example.factory_design_pattern.factory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
// code to test strategy design pattern
//        Vechile vechile = new Vechile();
//        vehicle.drive();
//        vehicle = new PassengerVehicle();
//        vehicle.drive();
//        System.out.println("Hello world!");

// code to test observable design pattern
//        IphoneObservable iphoneObservable = new IphoneObservable();
//        MacBookObservable macBookObservable = new MacBookObservable();
//
//        EmailAlertObserver observer1 = new EmailAlertObserver("kumarsv01@gmail.com", iphoneObservable);
//        PhoneAlertObserver observer2 = new PhoneAlertObserver("7018433066", iphoneObservable);
//        EmailAlertObserver observer3 = new EmailAlertObserver("kumarsv01@gmail.com", macBookObservable);
//        PhoneAlertObserver observer4 = new PhoneAlertObserver("7018433066", macBookObservable);
//
//        iphoneObservable.addSubscriber(observer1);
//        iphoneObservable.addSubscriber(observer2);
//        macBookObservable.addSubscriber(observer3);
//        macBookObservable.addSubscriber(observer4);
//
//        iphoneObservable.setStockCount(2);
//        macBookObservable.setStockCount(6);

//        BasePizza basePizza1 = new FarmHousePizza();
//        BasePizza basePizza2 = new ExtraCheese(new FarmHousePizza());
//        BasePizza basePizza3 = new Jalapeno(new FarmHousePizza());
//        BasePizza basePizza4 = new VeggieDelightPizza();
//        BasePizza basePizza5 = new ExtraCheese(new VeggieDelightPizza());
//        BasePizza basePizza6 = new Jalapeno(new VeggieDelightPizza());
//        BasePizza basePizza7 = new ExtraCheese(new Jalapeno(new FarmHousePizza()));
//        BasePizza basePizza8 = new Jalapeno(new ExtraCheese(new VeggieDelightPizza()));
//
//        System.out.println("Farm House Pizza cost : " + basePizza1.cost());
//        System.out.println("Farm House Pizza with extra cheese cost : " + basePizza2.cost());
//        System.out.println("Farm House Pizza with jalapeno cost : " + basePizza3.cost());
//        System.out.println("Veggie Delight Pizza cost : " + basePizza4.cost());
//        System.out.println("Veggie Delight with extra cheese Pizza cost : " + basePizza5.cost());
//        System.out.println("Veggie Delight with jalapeno Pizza cost : " + basePizza6.cost());
//        System.out.println("Farm House with extra cheese and jalapeno Pizza cost : " + basePizza7.cost());
//        System.out.println("Veggie Delight with extra cheese and jalapeno Pizza cost : " + basePizza8.cost());

        VehicleFactory vehicleFactory = new VehicleFactory();
        VehicleAbstractFactory vehicleAbstractFactory = new VehicleAbstractFactory();
        Vehicle vehicle1 = vehicleFactory.createVehicle("CAR");
        vehicle1.calculateMileage();
        vehicle1.getNumberOfWheels();

        Vehicle vehicle2 = vehicleFactory.createVehicle("BIKE");
        vehicle2.getNumberOfWheels();
        vehicle2.calculateMileage();

        Vehicle vehicle3 = vehicleAbstractFactory.createFactory("honda").createVehicle("CAR");
        vehicle3.calculateMileage();
        vehicle3.getNumberOfWheels();

        Vehicle vehicle4 = vehicleAbstractFactory.createFactory("BMW").createVehicle("CAR");
        vehicle4.calculateMileage();
        vehicle4.getNumberOfWheels();
    }
}