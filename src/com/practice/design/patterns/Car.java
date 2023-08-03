package com.practice.design.patterns;

/**
 * @author Prasenjit Kumar Das
 */
public class Car implements Vehicle {
    public Car() {}
    @Override
    public void getWheel() {
        System.out.println("Car has 4 wheels");
    }
}
