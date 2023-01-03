package com.practice.ds.scaler;

import java.util.List;

public class LinkedListDeletion {
    public static void main(String agrs[]) {
        LinkedListN linkedListN = new LinkedListN();
        linkedListN.insert("Jyoti");
        linkedListN.insert("Babali");
        linkedListN.insert("Alia");
        linkedListN.insert("Deepika");
        linkedListN.insert("Aish");
        linkedListN.insert("Shilpa");
        List<LinkedListN> linkedList = linkedListN.show();
        System.out.println("-------------------------------------------------");
    }
    private void deleteAtStart(){
        LinkedListN linkedListN = new LinkedListN();
        List<LinkedListN> linkedList = linkedListN.show();


    }
}
