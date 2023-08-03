package com.practice.sorting.algorithms;

/**
 * @author Prasenjit Kumar Das
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1,4};
        int n = arr.length;
        System.out.println("Before Sorting...");
        for (int ele : arr) {
            System.out.println(ele);
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After Sorting...");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
