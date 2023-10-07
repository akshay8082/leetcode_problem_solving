package com.leetcode.practice.problems.servicenow;

import java.util.ArrayList;
/*
You are given an integer N. Your task is to return a
2-D ArrayList containing the pascal’s triangle till the row N.
A Pascal's triangle is a triangular array constructed by summing adjacent elements
in preceding rows. Pascal's triangle contains the values of the binomial coefficient
 */

public class PascalTriangle {
    public static ArrayList<ArrayList<Integer>> generatePascalsTriangle(int N) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

        if (N < 1) {
            return triangle;
        }

        // Initialize the first row with 1
        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        // Generate the rest of the rows
        for (int i = 1; i < N; i++) {
            ArrayList<Integer> prevRow = triangle.get(i - 1);
            ArrayList<Integer> currentRow = new ArrayList<>();

            // The first element of each row is always 1
            currentRow.add(1);

            // Calculate the elements in the current row based on the previous row
            for (int j = 1; j < i; j++) {
                int sum = prevRow.get(j - 1) + prevRow.get(j);
                currentRow.add(sum);
            }

            // The last element of each row is always 1
            currentRow.add(1);

            // Add the current row to the triangle
            triangle.add(currentRow);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int N = 5;
        ArrayList<ArrayList<Integer>> result = generatePascalsTriangle(N);

        // Print the Pascal's Triangle
        for (ArrayList<Integer> row : result) {
            for (Integer num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
