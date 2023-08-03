package com.lowleveldesign.rateLimiter.leakybucket;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Prasenjit Kumar Das
 */
public class UserBucketCreater {

    Map<Integer, LeakyBucket> bucket;

    public UserBucketCreater(int id) {
        this.bucket = new HashMap<>();
        bucket.put(id, new LeakyBucket(10));
    }

    void accessApplication(int id) {
        if(bucket.get(id).grantAccess()) {
            System.out.println(Thread.currentThread().getName() + " Able to Access the Application");
        } else {
            System.out.println(Thread.currentThread().getName() + " Too many request !!!");
        }
    }
}
