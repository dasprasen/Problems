package com.practice.problems;

import java.util.Arrays;

/**
 * @author Prasenjit Kumar Das
 */
public class SetMatrixZeroes {

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        System.out.println("The Final Matrix is ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void setZeroes(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int dummy1[] = new int[rows];
        int dummy2[] = new int[cols];
        Arrays.fill(dummy1,-1);
        Arrays.fill(dummy2,-1);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    dummy1[i] = 0;
                    dummy2[j] = 0;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dummy1[i] == 0 || dummy2[j]==0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}