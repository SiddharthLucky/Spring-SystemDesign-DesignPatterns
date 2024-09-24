package com.learning.sysdesign_designpatterns.Design_Patterns.Factory_Pattern;

public class VehicleFactory {
    public Vehicle createVehicle(String vehicleType) {
        return switch (vehicleType.toLowerCase()) {
            case "car" -> new Car();
            case "bike" -> new Bike();
            default -> null;
        };
    }
}
