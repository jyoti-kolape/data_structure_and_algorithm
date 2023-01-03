package com.practice.ds.scaler.practice.day54;

public class KReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        printList(reverseList(head, 2));
    }
    static void printList(ListNode ptr)
    {
        while (ptr != null) {
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    public static ListNode reverseList(ListNode A, int B) {
        if(A == null){
            return null;
        }

        ListNode curr = A;
        ListNode prev = null;
        ListNode temp = null;
        int k = 0;
        while(k < B){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            k++;
        }
        A.next = reverseList(curr, B);
        return prev;
    }
}
