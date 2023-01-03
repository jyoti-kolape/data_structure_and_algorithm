package com.practice.ds.success1.day54;

public class MiddleElementLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        System.out.println(solve(head));
    }

    public static int solve(ListNode A) {
        int count = countNode(A);
        int mid = count / 2;
        ListNode head = A;
        while(mid > 0){
            head = head.next;
            mid--;
        }
        return head.val;

    }

    public static int countNode(ListNode A){
        int count = 0;
        while(A != null){
            A = A.next;
            count++;
        }
        return count;
    }
}
