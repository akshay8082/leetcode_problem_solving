package com.leetcode.practice.problems.google;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatCharacterInString {

    //Example . ilovejavalanguage . I is the first non repeat character

    public static void main(String[] args) {
        String input = "ilovejavalanguage";

        System.out.println(Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new , Collectors.counting()))
                .entrySet()
                .stream().filter(stringLongEntry -> stringLongEntry.getValue() == 1)
                .findFirst().get().getKey());

    }

}
