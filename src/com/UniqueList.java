package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Prasenjit Kumar Das
 */
public class UniqueList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 1);

        List<Integer> uniqueList = list.stream().filter(a -> list.stream().filter(x -> x.equals(a)).count() == 1)
                .collect(Collectors.toList());
        uniqueList.forEach(System.out::println);
    }
}
