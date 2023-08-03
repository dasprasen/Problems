package com.practice.design.patterns;

/**
 * @author Prasenjit Kumar Das
 */
public class SingletonDesignPatternMain {
    public static void main(String[] args) {
        SingletonDesignPattern singletonDesignPattern = SingletonDesignPattern.getInstance();
        System.out.println(singletonDesignPattern);

        SingletonSynchronizedMethod singletonSynchronizedMethod = SingletonSynchronizedMethod.getSynchronizedMethod();
        System.out.println(singletonSynchronizedMethod);

        SingletonSynchronizedBlock singletonSynchronizedBlock = SingletonSynchronizedBlock.getSingletonSynchronizedBlock();
        System.out.println(singletonSynchronizedBlock);
    }
}
