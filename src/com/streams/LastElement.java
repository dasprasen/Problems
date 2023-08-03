package com.streams;

import java.util.stream.Stream;

/**
 * @author Prasenjit Kumar Das
 * Given a stream containing some elements, the task is to get the last element of the Stream in Java.
 * Input: Stream={“Geek_First”, “Geek_2”, “Geek_3”, “Geek_4”, “Geek_Last”}
 * Output: Geek_Last
 *
 * Input: Stream={1, 2, 3, 4, 5, 6, 7}
 * Output: 7
 */
public class LastElement {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");

        // Print the last element of a Stream
        System.out.println("Last Element: " + lastElementInStream(stream));
    }

    private static <T> T lastElementInStream(Stream<T> stream) {
        return stream.reduce((first, second) -> second).orElse(null);
    }
}
