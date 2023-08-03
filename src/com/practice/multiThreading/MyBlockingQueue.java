package com.practice.multiThreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Prasenjit Kumar Das
 */
public class MyBlockingQueue <E> {
    private Queue<E> queue;
    private int max = 16;
    private Lock lock = new ReentrantLock(true);
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();
    public MyBlockingQueue(int size) {
        queue = new LinkedList<>();
        this.max = size;
    }

    public void put(E e) throws InterruptedException {
        lock.lock();
        try {
            while(queue.size() == max) {
                notFull.await();
            }
            queue.add(e);
            notEmpty.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public E take() throws InterruptedException {
        lock.lock();
        try {
            while(queue.size() == 0) {
                notEmpty.await();
            }
            E item = queue.remove();
            return item;
        } finally {
            lock.unlock();
        }
    }
}
