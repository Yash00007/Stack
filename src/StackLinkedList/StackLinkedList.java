package StackLinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class StackLinkedList {
    private LinkedList<Integer> stack;

    StackLinkedList() {
        stack = new LinkedList<Integer>();
    }

    public void push(int i) {
        stack.push(i);
    }

    public void pop() {
        try {
            if (stack.isEmpty()) {
                System.out.println("Stack is empty can't pop");
                return;
            }
            stack.pop();

        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public int peek() {
        return stack.peek();
    }

    public void printStack() {
        ListIterator li = stack.listIterator();
        System.out.println("|STACK|");
        System.out.println("|-----|");

        while (li.hasNext()) {
            System.out.println("|  " + li.next() + "  |");
            System.out.println("|-----|");
        }
    }

}
