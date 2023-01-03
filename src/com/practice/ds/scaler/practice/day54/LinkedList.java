package com.practice.ds.scaler.practice.day54;

public class LinkedList {
    static ListNode head = null;

    public static void main(String[] args) {
        insert_node(1, 1);
        insert_node(2, 2);
        insert_node(3, 3);
        insert_node(4, 4);

        insert_node(3, 0);
        print_ll();

    }

    public static void insert_node(int position, int value) {
        ListNode newNode = new ListNode(value);
        ListNode temp = head;
        int count=0;
        if(temp==null){
            head=newNode;
            return;
        }
        while (temp.next!=null && count<=position-1){
            temp=temp.next;
            count++;
        }
        if(count>=position){
            return;
        }
        if(temp.next==null){
            temp.next=newNode;
            return;
        }
        newNode.next =temp.next.next;
        temp.next=newNode;
    }

    public static void delete_node(int position) {
        if (head == null)
            return;

        ListNode temp = head;

        if (position == 1) {
            head = temp.next;
            return;
        }
        for (int i = 1; temp != null && i < position - 1; i++){
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            return;
        }
        ListNode next = temp.next.next;
        temp.next = next;
    }

    public static void print_ll() {
        // Output each element followed by a space
        while (head != null) {
            System.out.print(head.val+" ");
            head = head.next;
        }
        System.out.println();
    }

}
