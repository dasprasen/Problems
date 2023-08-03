package com.practice.multiThreading;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Prasenjit Kumar Das
 */
public class BankExample {
    static HashMap<Integer, List<Integer>> accountTransactionsMap = new HashMap<>();
    static HashMap<Integer, Integer> results = new HashMap<>();

    static class TransactionFactory implements Runnable {
        private int numTransactions = 40;
        private CountDownLatch latch;

        public TransactionFactory(CountDownLatch latch) {
            this.latch = latch;
        }
        @Override
        public void run() {
            System.out.println("Entering TransactionFactory");
            int i = numTransactions;
            while (i > 0) {
                try {
                    int randomAccountNumber = ThreadLocalRandom.current().nextInt(0, 100);
                    int randomAmount = ThreadLocalRandom.current().nextInt(-1000, 1000);
                    System.out.println("Random Account: " + randomAccountNumber + " Random Amount: " + randomAmount);
                    List<Integer> values = accountTransactionsMap.get(randomAccountNumber);
                    if (values == null) {
                        values = new ArrayList<Integer>();
                        accountTransactionsMap.put(randomAccountNumber, values);
                        results.put(randomAccountNumber, 0);
                        i--;
                    }
                    values.add(randomAmount);
                    results.put(randomAccountNumber, results.get(randomAccountNumber) + randomAmount);
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Exiting TransactionFactory");
            latch.countDown();
        }
    }

    static class Aggregator implements Runnable {
        int a_account;
        CountDownLatch latch;
        Aggregator(int account, CountDownLatch latch) {
            this.a_account = account;
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Aggregator running for account: " + a_account);
            int sum = 0;
            int prevSize = 0;
            List<Integer> amounts = accountTransactionsMap.get(a_account);
            if (amounts != null && amounts.size() > prevSize) {
                while (amounts.size() > prevSize) {
                    sum += amounts.get(prevSize);
                    prevSize++;
                }
            }
            System.out.println("Aggregation for account: " + a_account + " is " + sum);
            if (results.get(a_account) != null && sum != results.get(a_account)) {
                System.out.println("Aggregation is incorrect. Expected: " + results.get(a_account) + ", Found: " + sum);
            } else {
                System.out.println("Aggregation is correct");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        Thread transactionFactory = new Thread(new TransactionFactory(latch));
        Thread aggregator2 = new Thread(new Aggregator(2, latch));
        Thread aggregator3 = new Thread(new Aggregator(3, latch));

        transactionFactory.start();
        aggregator2.start();
        aggregator3.start();
    }
}


