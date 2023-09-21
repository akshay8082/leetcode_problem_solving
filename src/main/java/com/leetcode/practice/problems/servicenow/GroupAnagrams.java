package com.leetcode.practice.problems.servicenow;

import com.sun.source.tree.BinaryTree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagrams {

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for(String word: strs){

            String sortedWordKey = Stream.of(word.toLowerCase().split(""))
                    .sorted()
                    .collect(Collectors.joining());
            if(!anagramMap.containsKey(sortedWordKey)){
                anagramMap.put(sortedWordKey, new ArrayList<>());
            }
            anagramMap.get(sortedWordKey).add(word);
        }

        return new ArrayList<>(anagramMap.values());

    }
}
