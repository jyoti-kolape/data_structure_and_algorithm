package com.practice.ds.success1.day54;

public class RemoveNthNodeListEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
       /* head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);*/
        printList(removeNthFromEnd(head, 1));
    }

    static void printList(ListNode ptr) {
        while (ptr != null) {
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    public static ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode temp = A;
        int k = 1;
        final int i = countNode(A);
        if (B >= i) {
            A = A.next;
            return A;
        }
        if (B == 1) {
            if (temp.next == null) {
                return null;
            }
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            return A;
        }
        while (k < (i - B) && temp.next != null) {
            temp = temp.next;
            k++;
        }

        temp.next = temp.next.next;
        return A;
    }

    public static int countNode(ListNode A) {
        int count = 0;
        while (A != null) {
            A = A.next;
            count++;
        }
        return count;
    }
}
