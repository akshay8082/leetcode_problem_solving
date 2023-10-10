package com.leetcode.practice.problems.servicenow;

import java.util.Arrays;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 6, 5};
        System.out.println(hasPythagoreanTriplets(nums));
    }

    private static boolean hasPythagoreanTriplets(int[] nums) {

        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);

        for(int i= nums.length -1; i>=2; i--){
            int a = nums[i];
            int left = 0;
            int right =i-1;

            while (left<right){
                int b= nums[left];
                int c= nums[right];
                if(b+c == a){
                    return true;
                }

                if(b+c <a){
                    left++;
                }else{
                    right--;
                }

            }

        }

        return false;

    }
}
