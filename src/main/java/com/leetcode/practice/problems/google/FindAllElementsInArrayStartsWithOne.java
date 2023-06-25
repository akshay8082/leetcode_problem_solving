package com.leetcode.practice.problems.google;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindAllElementsInArrayStartsWithOne {

    public static void main(String[] args) {

        int[] numbers = {5,9,11,2,8,21,1};

        System.out.println(Arrays.stream(numbers)
                .boxed()
                .map(s-> s+"")
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList()));
    }
}
