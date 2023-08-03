package com.practice.design.patterns;

/**
 * @author Prasenjit Kumar Das
 */
public class VehicleFactory {

    public static Vehicle getInstance(String type) {
        if(type.isEmpty() || type == "null"){
            return null;
        }
        switch (type) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            default:
                throw new IllegalArgumentException("Unknown Vehicle Type "+type);
        }
    }
}
