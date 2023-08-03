package com.practice.design.patterns;

/**
 * @author Prasenjit Kumar Das
 */
public class SingletonSynchronizedMethod {
    private static SingletonSynchronizedMethod synchronizedMethod;

    private SingletonSynchronizedMethod() {}

    public static synchronized SingletonSynchronizedMethod getSynchronizedMethod() {
        if(synchronizedMethod == null) {
            synchronizedMethod = new SingletonSynchronizedMethod();
        }
        return synchronizedMethod;
    }
}
