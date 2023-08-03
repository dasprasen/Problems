package com.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Prasenjit Kumar Das
 * Given a stream containing some elements, the task is to find the duplicate elements in this stream in Java.
 * Input: Stream = {5, 13, 4, 21, 13, 27, 2, 59, 59, 34}
 * Output: [59, 13]
 * Explanation:
 * The only duplicate elements in the given stream are 59 and 13.
 *
 * Input: Stream = {5, 13, 4, 21, 27, 2, 59, 34}
 * Output: []
 * Explanation:
 * There are no duplicate elements in the given stream, hence the output is empty.
 */
public class DuplicateElement {
    public static void main(String[] args) {
        // Initial stream
        List<Integer> list = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);

        // Print the found duplicate elements
        System.out.println(findDuplicateInStream(list));
    }

    private static <T> Set<T> findDuplicateInStream(List<T> list) {
        return list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());
    }
}
