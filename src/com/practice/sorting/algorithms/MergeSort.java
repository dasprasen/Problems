package com.practice.sorting.algorithms;

/**
 * @author Prasenjit Kumar Das
 */
public class MergeSort {
    public static void main(String[] args) {
        long[] arr = new long[]{2, 4, 1, 3, 5};
        long n = arr.length;
        long merged[] = new long[(int) n];
        long result = divide(arr, merged, 0, n-1);
        for(long i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(result);
    }

    private static long divide(long[] arr, long[] merged, long l, long r) {
        long count = 0;
        if(r>l) {
            long mid = (l + r)/2;
            count += divide(arr, merged, l, mid);
            count += divide(arr, merged, mid+1, r);
            count += conquer(arr, merged, l, mid+1, r);
        }
        return count;
    }

    private static long conquer(long[] arr, long[] merged, long l, long mid, long r) {
        long count = 0;
        long i=l;
        long j=mid;
        long x=l;
        while(i<=mid-1 && j<=r) {
            if(arr[(int) i] <= arr[(int) j]){
                merged[(int) x++] = arr[(int) i++];
            } else {
                merged[(int) x++] = arr[(int) j++];
                count += (mid - i);
            }
        }
        while(i<=mid-1) {
            merged[(int) x++] = arr[(int) i++];
        }
        while(j<=r) {
            merged[(int) x++] = arr[(int) j++];
        }
        for(i=l;i<=r;i++) {
            arr[(int) i] = merged[(int) i];
        }
        return count;
    }
}
