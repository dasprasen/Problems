package com.practice.design.patterns;

/**
 * @author Prasenjit Kumar Das
 */
public class FactoryMain {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getInstance("car");
        car.getWheel();

        Vehicle bike = VehicleFactory.getInstance("bike");
        bike.getWheel();
    }
}
