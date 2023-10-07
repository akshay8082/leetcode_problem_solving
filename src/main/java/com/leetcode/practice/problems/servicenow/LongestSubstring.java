package com.leetcode.practice.problems.servicenow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public static void main(String[] args) {
        String input ="abcabcbb";
        int length =lengthOfLongestSubstring(input);
        System.out.println(length);
    }

    private static int lengthOfLongestSubstring(String input) {

        if(input== null || input.length()==0){
            return 0;
        }

        int maxLength =0;
        int start =0;
        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for (int end = 0; end < input.length(); end++) {
            char currentCharacter = input.charAt(end);

            if(characterIntegerMap.containsKey(currentCharacter)){
                start = Math.max(start, characterIntegerMap.get(currentCharacter)+1);
            }
            characterIntegerMap.put(currentCharacter, end);
            maxLength = Math.max(maxLength, end-start +1);
        }
        return maxLength;
    }
}
