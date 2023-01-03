package com.practice.ds.scaler.practice.day25;

import java.util.ArrayList;

public class DesignLinkedList {

    public static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
 /*       A :
[
  [1, 13, -1]
  [3, 0, -1]
  [3, 1, -1]
  [2, 15, 0]
  [3, 0, -1]
  [1, 12, -1]
  [3, 0, -1]
  [1, 19, -1]
  [1, 13, -1]
  [3, 0, -1]
  [0, 12, -1]
  [1, 13, -1]
  [3, 2, -1]
]*/

/*        A :
[
  [2, 18, 0]
  [2, 5, 1]
  [2, 8, 0]
  [1, 7, -1]
  [1, 5, -1]
]*/

        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        ArrayList<Integer> arr4 = new ArrayList<>();
        ArrayList<Integer> arr5 = new ArrayList<>();
        ArrayList<Integer> arr6 = new ArrayList<>();
        arr1.add(2);
        arr1.add(18);
        arr1.add(0);

        arr2.add(2);
        arr2.add(5);
        arr2.add(1);

        arr3.add(2);
        arr3.add(8);
        arr3.add(0);

        arr4.add(1);
        arr4.add(7);
        arr4.add(-1);

        arr5.add(1);
        arr5.add(5);
        arr5.add(-1);


        input.add(arr1);
        input.add(arr2);
        input.add(arr3);
        input.add(arr4);
        input.add(arr5);
       // input.add(arr6);

        solve(input);
    }

    static ListNode head;

    public static ListNode solve(ArrayList<ArrayList<Integer>> A) {
        int val, position, op;
        for (int row = 0; row < A.size(); row++) {
            op = A.get(row).get(0);
            val = A.get(row).get(1);
            position = A.get(row).get(2);
            switch (op) {
                case 0:
                    // first node append
                    insert_node(0, val);
                    break;
                case 1:
                    // last node append
                    insertAtLast(val);
                    break;
                case 2:
                    // in between append
                    insert_node(position, val);
                    break;
                case 3:
                    // delete at position
                    position = A.get(row).get(1);
                    delete_node(position);
            }
        }
        return head;
    }

    public static void insert_node(int position, int value) {
        ListNode temp = head;
        if (position == 0) {
            if (head == null) {
                head = new ListNode(value);
            } else {
                ListNode newNode = new ListNode(value);
                newNode.next = head;
                head = newNode;
            }
            return;
        }
        for (int i = 0; i < position - 1; i++) {
            if (temp != null) {
                temp = temp.next;
            } else {
                return;
            }
        }
        if (temp == null) {
            ListNode temp2 = head;
            while (temp2.next != null) {
                temp2 = temp2.next;
            }
            temp2.next = new ListNode(value);
        } else {
            ListNode newListNode = new ListNode(value);
            newListNode.next = temp.next;
            temp.next = newListNode;
        }
    }

    public static void insertAtLast(int value) {
        ListNode temp = head;
        if (head == null) {
            head = new ListNode(value);
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new ListNode(value);

    }

    public static void delete_node(int position) {
        ListNode temp = head;
        if (head == null) {
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }
        for (int i = 0; i < position - 1; i++) {
            if (temp != null) {
                temp = temp.next;
            } else {
                return;
            }
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }

    }
}
