package com.practice.ds.success;

import java.util.ArrayList;
import java.util.List;

public class LinkedListN {

    public static void main(String agrs[]) {
        LinkedListN linkedListN = new LinkedListN();
        linkedListN.insert("Jyoti");
        linkedListN.insert("Babali");
        linkedListN.insert("Alia");
        linkedListN.insert("Deepika");
        linkedListN.insert("Aish");
        linkedListN.show();
        System.out.println("----------insert at specific position----------");
        linkedListN.insertAt(3, "Shilpa");
        linkedListN.show();

        System.out.println("----------Insert at start----------");
        linkedListN.insertAtStart("Madhuri");
        linkedListN.show();

        System.out.println("----------Insert at end----------");
        linkedListN.insertAtEnd("Zero");
        linkedListN.show();

        System.out.println("----------Delete at start----------");
        linkedListN.deleteAtStart();
        linkedListN.show();

        System.out.println("----------Delete at end----------");
        linkedListN.deleteAtEnd();
        linkedListN.show();

        System.out.println("----------Delete at specific posistion----------");
        linkedListN.deleteAt(4);
        linkedListN.show();

        System.out.println("----------Searching----------");
        System.out.println(linkedListN.search("Aish"));
    }

    public List<LinkedListN> show() {
        List<LinkedListN> list = new ArrayList<>();
        LinkedListN ln = new LinkedListN();
        NodeN n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
            ln.head = n;
            list.add(ln);
        }
        System.out.println(n.data);
        return list;
    }

    NodeN head;

    public void insert(String data) {
        NodeN nodeN = new NodeN();
        nodeN.data = data;
        nodeN.next = null;

        if (head == null) {
            head = nodeN;
        } else {
            NodeN n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = nodeN;
        }
    }

    public void insertAt(int index, String data) {
        NodeN nodeN = new NodeN();
        nodeN.data = data;
        nodeN.next = null;

        if (head == null) {
            head = nodeN;
        } else {
            NodeN current = head;
            NodeN previous;
            int count = 1;
            while (current.next != null) {
                previous = current;
                current = current.next;
                count++;
                if (count == index) {
                    previous.next = nodeN;
                    nodeN.next = current;
                    break;
                }
            }
        }
    }

    public void insertAtStart(String data) {
        NodeN nodeN = new NodeN();
        nodeN.data = data;

        nodeN.next = head;
        head = nodeN;
    }

    public void insertAtEnd(String data) {
        NodeN nodeN = new NodeN();
        nodeN.data = data;
        nodeN.next = null;

        NodeN node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = nodeN;
    }

    private void deleteAtStart() {
        NodeN node = head;
        while (node.next != null) {
            node = node.next;
            head = node;
            break;
        }
    }

    private void deleteAtEnd() {
        NodeN node = head;
        while(node.next.next != null){
            node = node.next;
        }
        node.next = null;

    }

    private void deleteAt(int position) {
        NodeN current = head;
        NodeN previous;
        int count = 1;
        while(current.next != null){
            previous = current;
            current = current.next;
            count++;
            if(count == position){
                previous.next = current.next;
                break;
            }
        }
    }

    private int search(String data) {
        NodeN node = head;
        int count = 1;
        while(node.next != null){
           if(node.data.equals(data)){
             return count;
           }
           node = node.next;
           count++;
        }
        return 0;
    }
}
