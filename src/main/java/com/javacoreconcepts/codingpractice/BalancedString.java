package com.javacoreconcepts.codingpractice;

import java.util.Stack;

public class BalancedString {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                // Check if stack is empty or top of stack does not match the closing bracket
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, all opening brackets were matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "{[()]}";
        String test2 = "{[(])}";
        String test3 = "{[}";
        String test4 = "([{}])";

        System.out.println("Test 1: " + (isBalanced(test1) ? "Balanced" : "Not Balanced"));
        System.out.println("Test 2: " + (isBalanced(test2) ? "Balanced" : "Not Balanced"));
        System.out.println("Test 3: " + (isBalanced(test3) ? "Balanced" : "Not Balanced"));
        System.out.println("Test 4: " + (isBalanced(test4) ? "Balanced" : "Not Balanced"));
    }

}
