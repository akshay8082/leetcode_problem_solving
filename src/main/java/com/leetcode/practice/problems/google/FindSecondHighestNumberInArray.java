package com.leetcode.practice.problems.google;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FindSecondHighestNumberInArray {

    public static void main(String[] args) {

        int[] numbers = {5,9,11,2,8,21,1};

        System.out.println(Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get());

    }
}
