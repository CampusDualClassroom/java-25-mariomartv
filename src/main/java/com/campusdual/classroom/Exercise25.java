package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
    Stack<String> stack = new Stack<String>();
    stack.add("Smith");
    stack.add("Montessori");
    stack.add("Peralta");
    stack.add("House");
    return stack;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        System.out.println("Elemento arriba "+ stack.peek());
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {

    }



}
