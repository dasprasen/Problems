package com.streams;

import java.util.stream.Stream;

/**
 * @author Prasenjit Kumar Das
 * Given a stream containing some elements, the task is to get the first element of the Stream in Java.
 * Input: Stream = {“Geek_First”, “Geek_2”, “Geek_3”, “Geek_4”, “Geek_Last”}
 * Output: Geek_First
 *
 * Input: Stream = {1, 2, 3, 4, 5, 6, 7}
 * Output: 1
 */
public class FirstElement {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");

        // Print the first element of a Stream
        System.out.println("First Element: " + firstElementInStream(stream));
    }

    private static <T> T firstElementInStream(Stream<T> stream) {

        return stream.findFirst().orElse(null);
    }
}
