package com.javacoreconcepts.datastructures;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //Adding elements to Stack using push()
        stack.push(1);
        stack.push(2);
        stack.push(2);
        //Adding elements to Stack using add() since it directly extend Vector
        stack.add(4);
        stack.add(5);
        //Accessing the elements
        System.out.println("Stack: " + stack);
        System.out.println("stack.peek(): " + stack.peek());
        System.out.println("stack.pop(): " + stack.pop());
        System.out.println("Stack: " + stack);
    }
}
