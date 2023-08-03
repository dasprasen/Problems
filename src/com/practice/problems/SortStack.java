package com.practice.problems;

import java.util.ListIterator;
import java.util.Stack;

/**
 * @author Prasenjit Kumar Das
 */
public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(-2);
        stack.push(9);
        stack.push(-7);
        stack.push(3);
        System.out.println("Stack elements before sorting: ");
        printStack(stack);
        sortStack(stack);
        System.out.println(" \n\nStack elements after sorting:");
        printStack(stack);
    }

    public static void printStack(Stack<Integer> s)
    {
        ListIterator<Integer> lt = s.listIterator();
        // forwarding
        while (lt.hasNext())
            lt.next();
        // printing from top to bottom
        while (lt.hasPrevious())
            System.out.print(lt.previous() + " ");
    }

    private static void sortStack(Stack<Integer> stack) {
        if(!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            insertSorted(stack, temp);
        }
    }

    private static void insertSorted(Stack<Integer> stack, int temp) {
        if(stack.isEmpty() || temp > stack.peek()) {
            stack.push(temp);
            return;
        } else {
            int ele = stack.pop();
            insertSorted(stack, temp);
            stack.push(ele);
        }
    }
}
