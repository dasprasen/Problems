package com.practice.multiThreading;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Prasenjit Kumar Das
 */
public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        List<Long> input = Arrays.asList(0L, 345L, 545L, 456L, 23L);
        List<FactorialThread> threads = new ArrayList<>();
        for(long num : input) {
            threads.add(new FactorialThread(num));
        }

        for(Thread thread : threads) {
            thread.start();
        }

        for(Thread thread : threads) {
            thread.join();
        }

        for(int i=0;i<input.size();i++) {
            FactorialThread factorialThread = threads.get(i);
            if(factorialThread.isFinished()) {
                System.out.println("Factorial of " + input.get(i) + " is " + factorialThread.getRes());
            } else {
                System.out.println("The calculation for " + input.get(i) + " is still in progress");
            }
        }
    }
}

class FactorialThread extends Thread {
    private long input;
    private BigInteger res = BigInteger.ZERO;
    private boolean isFinished = false;

    public  FactorialThread(long input) {
        this.input = input;
    }

    public void run() {
        this.res = fact(input);
        this.isFinished = true;
    }

    public BigInteger fact(long n) {
        BigInteger tempRes = BigInteger.ONE;
        for(long i = n;i>0;i--) {
            tempRes = tempRes.multiply(new BigInteger(Long.toString(i)));
        }
        return tempRes;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public BigInteger getRes() {
        return res;
    }
}
