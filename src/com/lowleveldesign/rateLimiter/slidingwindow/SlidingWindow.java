package com.lowleveldesign.rateLimiter.slidingwindow;

import com.lowleveldesign.rateLimiter.RateLimiter;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author Prasenjit Kumar Das
 */
public class SlidingWindow implements RateLimiter {

    Queue<Long> slidingWindow;
    int timeWindowInSeconds;
    int bucketCapacity;

    public SlidingWindow(int timeWindowInSeconds, int bucketCapacity) {
        this.timeWindowInSeconds = timeWindowInSeconds;
        this.bucketCapacity = bucketCapacity;
        slidingWindow = new ConcurrentLinkedQueue<>();
    }

    @Override
    public boolean grantAccess() {
        long currentTime = System.currentTimeMillis();
        checkAndUpdateQueue(currentTime);
        if(slidingWindow.size() < bucketCapacity) {
            slidingWindow.offer(currentTime);
            return true;
        }
        return false;
    }

    private void checkAndUpdateQueue(long currentTime) {
        if(slidingWindow.isEmpty()) return;
        long calculatedTime = (currentTime - slidingWindow.peek())/1000;
        while(calculatedTime >= timeWindowInSeconds) {
            slidingWindow.poll();
            if(slidingWindow.isEmpty()) break;
            calculatedTime = (currentTime - slidingWindow.peek())/1000;
        }
    }
}
