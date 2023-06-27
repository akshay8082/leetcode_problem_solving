package com.leetcode.practice.problems.google;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindNthHighestSalary {

    public static void main(String[] args) {

        Map<String, Integer> input = new HashMap<>();
        input.put("John", 1000);
        input.put("Cena", 1000);
        input.put("Stone", 1100);
        input.put("Cold", 1200);
        input.put("Goldberg", 1100);
        input.put("Shawn", 1200);
        input.put("Micheal", 1300);

        System.out.println(input.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList())
                .get(1));// this number will come from user


    }
}
