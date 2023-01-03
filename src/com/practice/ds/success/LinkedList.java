package com.practice.ds.success;


public class LinkedList {

    public static class Node {
        int data;
        Node next;
    }

    public static void main(String args[]) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(6);
        linkedList.insert(7);
        linkedList.show();
        System.out.println("__________________________________________________________________________");
        linkedList.insertAt(5, 10);
        linkedList.insertAt(3, 12);
        linkedList.insertAt(1, 20);
        //linkedList.insertAt(10, 30);
        linkedList.show();
    }

     static Node head;

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.print(node.data);
    }

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void insertAt(int position, int value) {
        Node node = new Node();
        node.data = value;
        node.next = null;
        int count = 1;

        Node current = head;
        Node previous = null;
        if (position > 1) {
            if (head == null) {
                head = node;
            } else {
                while (current.next != null) {
                    previous = current;
                    current = current.next;
                    count++;
                    if (count == position) {
                        node.next = current;
                        previous.next = node;
                        break;
                    }
                }
            }
        } else {
            node.next = current;
            head = node;
        }
    }
}
