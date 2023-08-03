package com.practice.problems;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @author Prasenjit Kumar Das
 */
public class Demo {
    public static void main(String[] args) {
        Instant now = Instant.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        String time = formatter.format(now);
        System.out.println(time);
    }
}
