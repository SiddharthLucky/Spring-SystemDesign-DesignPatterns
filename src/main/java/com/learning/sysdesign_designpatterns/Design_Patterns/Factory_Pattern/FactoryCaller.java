package com.learning.sysdesign_designpatterns.Design_Patterns.Factory_Pattern;

public class FactoryCaller {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle bike = vehicleFactory.createVehicle("bike");
        Vehicle car = vehicleFactory.createVehicle("car");
        bike.vehicleMethod();
        car.vehicleMethod();
    }
}
