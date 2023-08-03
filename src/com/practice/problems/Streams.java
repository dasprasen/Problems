package com.practice.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Prasenjit Kumar Das
 */
public class Streams {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(5, 6, 8, 2, 1)
        );
        System.out.println(list.toString());

        List<Integer> ans = list.stream().sorted().filter(a -> a > 2).collect(Collectors.toList());
        System.out.println(ans.toString());

    }
}
