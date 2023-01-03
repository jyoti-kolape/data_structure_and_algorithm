package com.practice.ds.success1.day54;

import java.util.List;

public class ReverseLinkList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        //head.next.next.next.next.next = new ListNode(6);
        //System.out.println(solve(head));
        printList(reverseBetween(head, 2, 4));
        //reverseBetween(head, 2, 4);
        //printList(reverse(head));
    }

    static void printList(ListNode ptr) {
        while (ptr != null) {
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    public static ListNode reverseBetween(ListNode A, int B, int C) {
        ListNode head = A;
        ListNode temp = null;
        int n = 1;
        while (n < B) {
            temp = A;
            A = A.next;
            n++;
        }

        ListNode prev = reverseList(A, C - B + 1);
        if (temp == null) return prev;

        temp.next = prev;
        return head;

    }

    public static ListNode reverseList(ListNode A, int B) {
        if (A == null) {
            return null;
        }

        ListNode curr = A;
        ListNode prev = null;
        ListNode temp = null;
        int k = 1;
        while (k <= B) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            k++;
        }

        prev = getNodeList(prev, curr);
        return prev;
    }

    private static ListNode getNodeList(ListNode prev, ListNode curr) {
        ListNode temp = prev;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = curr;
        return prev;
    }
}
