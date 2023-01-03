package com.practice.ds.success1.day54;

public class RemoveDuplicatesSortedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        printList(deleteDuplicates(head));
    }
    static void printList(ListNode ptr) {
        while (ptr != null) {
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }
    public static ListNode deleteDuplicates(ListNode A) {
        ListNode temp = A;
        while(temp.next != null){
            if(temp.next != null && temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        return A;
    }
}
