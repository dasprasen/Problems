package com.threads;

/**
 * @author Prasenjit Kumar Das
 */
public class MyRunnable implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        for(int i=1;i<5000;i++) {
            this.count++;
        }
        System.out.println(Thread.currentThread().getName()+" : "+this.count);
    }
}
