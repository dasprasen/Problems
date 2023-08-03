package com.practice.multiThreading;

/**
 * @author Prasenjit Kumar Das
 */
public class OddEvenMain {
    static int n;
    int count = 1;

    public void printEven() {
        synchronized (this) {
            while(count < n) {
                while(count % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Even Thread: "+count);
                count++;
                notify();
            }
        }
    }

    public void printOdd() {
        synchronized (this) {
            while(count<n) {
                while(count % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd Thread: " +count);
                count++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        OddEvenMain obj = new OddEvenMain();
        n = 20;

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.printEven();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.printOdd();
            }
        });

        t1.start();
        t2.start();

    }
}
