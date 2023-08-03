package com.lowleveldesign.rateLimiter.leakybucket;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Prasenjit Kumar Das
 */
public class Application {
    public static void main(String[] args) {
        UserBucketCreater userBucketCreater = new UserBucketCreater(1);
        ExecutorService executors = Executors.newFixedThreadPool(12);
        for(int i=0;i<12;i++) {
            executors.execute(() -> userBucketCreater.accessApplication(1));
        }
        executors.shutdown();
    }
}
