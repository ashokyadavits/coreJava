package coreJava.DSA.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // pop element
        System.out.println("Popped: " + stack.pop());

        // peek element
        System.out.println("Top element: " + stack.peek());

        // check empty
        System.out.println("Is empty? " + stack.isEmpty());
    }
    }