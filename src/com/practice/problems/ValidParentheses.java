package com.practice.problems;

import java.util.Stack;

/**
 * @author Prasenjit Kumar Das
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String str = "[(])";
        System.out.println(isValidParenthesis(str));
    }

    public static boolean isValidParenthesis(String expression) {
        // Write your code here.
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<expression.length();i++) {
            if(expression.charAt(i) == '[' || expression.charAt(i) == '(' || expression.charAt(i) == '{') {
                stack.push(expression.charAt(i));
            } else if((!stack.empty() && expression.charAt(i)==')' && stack.peek()=='(') ||
                    (!stack.empty() && expression.charAt(i)=='}' && stack.peek()=='{') ||
                    (!stack.empty() && expression.charAt(i)==']' && stack.peek()=='[')){
                stack.pop();
            } else
                return false;
        }
        return stack.isEmpty();
    }
}
