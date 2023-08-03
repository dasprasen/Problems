package com;

/**
 * @author Prasenjit Kumar Das
 */
public class MainThread {
    private static volatile int a = 0;
    private static volatile int b = 0;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (a + b >= 100) {
                        break;
                    }
                    a++;
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (a + b >= 100) {
                        break;
                    }
                    b++;
                }
            }
        });

        t1.start();
        t2.start();

        System.out.println("Final values: a = " + a + ", b = " + b);
    }
}
