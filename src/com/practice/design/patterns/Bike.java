package com.practice.design.patterns;

/**
 * @author Prasenjit Kumar Das
 */
public class Bike implements Vehicle {
    public Bike() {}
    @Override
    public void getWheel() {
        System.out.println("Bike has two wheels");
    }
}
