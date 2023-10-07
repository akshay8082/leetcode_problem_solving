package com.leetcode.practice.problems.servicenow;

/*
Given an ‘N’ x ‘M’ integer matrix, if an element is 0,
set its entire row and column to 0's, and return the matrix.
In particular, your task is to modify it in such a way that
if a cell has a value 0 (matrix[i][j] == 0),
then all the cells of the ith row and jth column should be changed to 0
 */
public class MatrixZeroes {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };
        setZeros(matrix);

        for (int[] row : matrix){
            for (int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static void setZeros(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] boolRows = new boolean[rows];
        boolean[] boolCols = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    boolRows[i] = true;
                    boolCols[j] = true;
                }

            }

        }


        for (int i = 0; i < rows; i++) {
            if (boolRows[i]) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 0; j < cols; j++) {
            if (boolCols[j]) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }


    }
}
