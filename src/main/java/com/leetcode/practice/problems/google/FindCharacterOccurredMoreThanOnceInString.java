package com.leetcode.practice.problems.google;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCharacterOccurredMoreThanOnceInString {

    //Example . ilovejavalanguage has a, l and g repeated

    public static void main(String[] args) {
        String input = "ilovejavalanguage";

        System.out.println(Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()));

    }

}
