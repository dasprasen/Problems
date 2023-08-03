package com.recursion;

/**
 * @author Prasenjit Kumar Das
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2,1,3,4};
        reverse(arr,0,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void reverse(int[] arr, int i, int length) {
        if(i>=length/2){
            return;
        }
        swap(arr, i, length-i-1);
        reverse(arr,i+1,length);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
