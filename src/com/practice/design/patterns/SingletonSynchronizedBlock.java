package com.practice.design.patterns;

/**
 * @author Prasenjit Kumar Das
 */
public class SingletonSynchronizedBlock {
    private static SingletonSynchronizedBlock singletonSynchronizedBlock;

    private SingletonSynchronizedBlock() {}

    public static SingletonSynchronizedBlock getSingletonSynchronizedBlock() {
        if(singletonSynchronizedBlock == null) {
            synchronized (SingletonSynchronizedBlock.class) {
                if(singletonSynchronizedBlock == null) {
                    singletonSynchronizedBlock = new SingletonSynchronizedBlock();
                }
            }
        }
        return singletonSynchronizedBlock;
    }
}
