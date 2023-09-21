package com.leetcode.practice.problems.servicenow;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AreStringsAnagramsOfEachOther {
    public static void main(String[] args) {
        String input1 ="listen";
        String input2 ="silent";

        System.out.println(isAnagram(input1, input2));

    }

    private static boolean isAnagram(String input1, String input2) {
       return Stream.of(input1.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining())
                .equals(Stream.of(input2.toLowerCase().split(""))
                        .sorted()
                        .collect(Collectors.joining()));
    }
}
