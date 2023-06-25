package com.leetcode.practice.problems.google;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharacterInString {

    //Example . ilovejava has a 2 times rest all characters are only time

    public static void main(String[] args) {
        String input = "ilovejava";

        System.out.println(Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

    }

}
