package com.practice.ds.success1.day54;

public class DeleteMiddleNodeLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        //System.out.println(solve(head));
        printList(solve(head));
    }

    public static ListNode solve(ListNode A) {
        if (A == null)
            return null;
        if (A.next == null) {
            return null;
        }
        ListNode head = A;
        int count = countNode(A);
        int mid = count / 2;
        while(mid > 1){
            A = A.next;
            mid--;
        }

        A.next = A.next.next;
        return head;
    }

    public static int countNode(ListNode A){
        int count = 0;
        while(A != null){
            A = A.next;
            count++;
        }
        return count;
    }

    static void printList(ListNode ptr)
    {
        while (ptr != null) {
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

}
