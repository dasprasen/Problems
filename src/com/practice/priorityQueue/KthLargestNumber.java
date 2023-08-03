package com.practice.priorityQueue;

import java.util.PriorityQueue;

/**
 * @author Prasenjit Kumar
 * By default PriorityQueue creates MinHeap
 * If wanted to convert into MaxHeap then we need to add the below line
 * PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
 */
public class KthLargestNumber {
    public static void main(String[] args) {
        int[] a = new int[] {3, 2, 1, 5, 6, 4};
        int k = 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++) {
            pq.add(a[i]);
        }
        for(int i=k;i<a.length;i++) {
            if(pq.peek() < a[i]) {
                pq.poll();
                pq.add(a[i]);
            }
        }
        System.out.println(pq.peek());
    }
}
