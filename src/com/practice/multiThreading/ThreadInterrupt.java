package com.practice.multiThreading;

import java.math.BigInteger;

/**
 * @author Prasenjit Kumar Das
 */
public class ThreadInterrupt {
    public static void main(String[] args) {
        Thread thread = new Thread(new LongComputationTask(new BigInteger("2"), new BigInteger("10")));
        thread.setDaemon(true);
        thread.start();
        thread.interrupt();
    }

    private static class BlockingTask implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Exiting Blocking Thread");
            }
        }
    }

    private static class LongComputationTask implements Runnable {
        private BigInteger base;
        private BigInteger pow;

        public LongComputationTask(BigInteger base, BigInteger pow) {
            this.base = base;
            this.pow = pow;
        }

        @Override
        public void run() {
            System.out.println(base+"^"+pow+" = " + pow(base, pow));
        }

        private BigInteger pow(BigInteger base, BigInteger pow) {
            BigInteger res = BigInteger.ONE;

            for(BigInteger i = BigInteger.ZERO; i.compareTo(pow) != 0; i = i.add(BigInteger.ONE)) {
                if(Thread.currentThread().isInterrupted()) {
                    System.out.println("Prematurely Interrupted Computation");
                    return BigInteger.ZERO;
                }
                res = res.multiply(base);
            }
            return res;
        }
    }
}
