package com.leetcode.practice.problems.servicenow;

public class ReverseString {
//Write a function to reverse a string in-place without using any additional data structures
    public static void main(String[] args) {
        String input = "pop";
        char[] inputCharArray = input.toCharArray();
        reverseString(inputCharArray);
        System.out.println(new String(inputCharArray));
    }

    private static void reverseString(char[] inputCharArray) {

        int left= 0;
        int right = inputCharArray.length-1;

        while(left<right){
            char temp = inputCharArray[left];
            inputCharArray[left] = inputCharArray[right];
            inputCharArray[right] = temp;
            left++;
            right--;
        }
    }
}
