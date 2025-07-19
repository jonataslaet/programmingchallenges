package com.github.jonataslaet.hackerrank;

import java.util.Objects;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}

public class SimplyLinkedList {

    Node head;
    Node tail;
    int size;

    void add(Node n) {
        if (size == 0) {
            head = n;
            tail = n;
            size++;
            return;
        }
        tail.next = n;
        tail = n;
        size++;
    }

    boolean hasCycle() {
        if (this.head == null) return false;
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node n0 = new Node(10);
        Node n1 = new Node(11);

        SimplyLinkedList s = new SimplyLinkedList();
        s.add(n0);
        s.add(n1);
        s.add(n0);
        System.out.println(s.hasCycle());
    }
}
