package com.learning.sysdesign_designpatterns.Design_Patterns.Factory_Pattern;

public interface Vehicle {
    default void vehicleMethod() {
        System.out.println("Vehicle method from interface.");
    }
}
