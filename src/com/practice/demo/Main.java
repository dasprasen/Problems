package com.practice.demo;

/**
 * @author Prasenjit Kumar Das
 */
public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        A obj3 = new B();

        obj1.printA();
        obj2.printA();
        obj2.printB();
        obj3.printA();
    }
}
