package StackLinkedListFromScratch;

public class MyLinkedList {
    private Node head;
    private Object Exception;

    MyLinkedList() {
        head = null;
    }

    public void push(int i) {
        Node newNode = new Node();
        newNode.setValue(i);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.setNext(head);
        head = newNode;
    }

    public void pop() {
        if (head == null) {
            System.out.println("List Is empty");
            return;
        }
        Node deletedNode = head;
        head.setNext(deletedNode.getNext());

    }

    public int peep() {
        try {
            if (head == null) {
                System.out.println("List Is empty");
                throw Exception;
            }
        } catch (Exception e) {

        }
        return head.getValue();
    }

    public class Node {
        private int value;
        private Node next;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
