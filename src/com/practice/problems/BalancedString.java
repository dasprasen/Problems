package com.practice.problems;

import java.util.Stack;

/**
 * @author Prasenjit Kumar Das
 */
public class BalancedString {
    public static void main(String[] args) {
        String str = "(2+3))2+3*[4-7]/8*(7+2))";
        Stack<Character> stack = new Stack<>();
        boolean flag=false;
        for(int i=0;i<str.length();i++) {
            flag = false;
            if((str.charAt(i) == ')' || str.charAt(i) == ']') && stack.isEmpty()) {
                flag=true;
                break;
            }
            if(str.charAt(i) == '(' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            } else if(str.charAt(i)==')') {
                if(stack.peek() == '(') {
                    stack.pop();
                }
            } else if(str.charAt(i) == ']') {
                if(stack.peek() == '[') {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty() && flag==false) {
            System.out.println("Balanced");
        } else {
            System.out.println("Un-Balanced");
        }
    }
}