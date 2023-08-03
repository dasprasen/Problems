package com.practice.heap;

import java.util.Arrays;

/**
 * @author Prasenjit Kumar Das
 */
public class MinHeap {
    private static int[] heap;
    private static int capacity;
    private static int size;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private static int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private static int getLeftChildIndex(int parentIndex) {
        return (2 * parentIndex + 1);
    }

    private static int getRightChildIndex(int parentIndex) {
        return (2 * parentIndex + 2);
    }

    private static void heapifyUp(int index) {
        int parentIndex = getParentIndex(index);
        if(parentIndex >= 0 && heap[index] < heap[parentIndex]) {
            swap(index, parentIndex);
            heapifyUp(parentIndex);
        }
    }

    private static void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    private static void heapifyDown(int index) {
        int smallestIndex = index;
        int leftChildIndex = getLeftChildIndex(index);
        int rightChildIndex = getRightChildIndex(index);
        if(leftChildIndex < size && heap[leftChildIndex] < heap[smallestIndex]) {
            smallestIndex = leftChildIndex;
        }

        if(rightChildIndex < size && heap[rightChildIndex] < heap[smallestIndex]) {
            smallestIndex = rightChildIndex;
        }

        if(smallestIndex != index) {
            swap(index, smallestIndex);
            heapifyDown(smallestIndex);
        }
    }

    private static void insert(int value) {
        if(size == capacity) {
            System.out.println("Heap is full..");
            return;
        }
        heap[size] = value;
        size++;
        heapifyUp(size-1);
    }

    private static int removeMin() {
        if(size == 0) {
            System.out.println("Heap is empty..");
            return -1;
        }
        int minValue = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return minValue;
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);

        minHeap.insert(3);
        minHeap.insert(2);
        minHeap.insert(1);
        minHeap.insert(5);
        minHeap.insert(6);
        minHeap.insert(4);

        System.out.println("Min Heap:");
        System.out.println(Arrays.toString(minHeap.heap));

        int minElement = minHeap.removeMin();
        System.out.println("Minimum Element Removed: " + minElement);

        System.out.println("Min Heap after removing minimum element:");
        System.out.println(Arrays.toString(minHeap.heap));
    }
}
