package com.leetcode.practice.problems.google;

import java.util.Arrays;

public class FindLongestStringFromArray {
    public static void main(String[] args) {
        String[] input ={"java", "springboot", "microservices"};

        System.out.println(Arrays.stream(input)
                .reduce((word1, nextWord) -> word1.length() > nextWord.length()? word1 : nextWord)
                .get());

    }
}
