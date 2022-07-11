package com.utsav.dsa.dataStructures.linkedList.singleLinkedList;

import java.util.Arrays;

public class SingleLinkedListMain {
    public static void main(String[] args) throws Exception {
        SingleLinkedListUtil singleLinkedListUtil = new SingleLinkedListUtil();
//        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
//        Integer[] arr = {1,2,3,4,5,6,7,8,9,10,11};
//        System.out.println("Adding " + Arrays.toString(arr) + " to LinkedList:");
//        Node head = singleLinkedListUtil.addArrayToLinkedList(arr);
//        singleLinkedListUtil.displaySingleLinkedList(head);

        Node head = null;
        QueueFromLinkedList queueFromLinkedList = new QueueFromLinkedList();
        head = queueFromLinkedList.enQueue(head,1);
        head = queueFromLinkedList.enQueue(head,2);
        head = queueFromLinkedList.enQueue(head,3);
        head = queueFromLinkedList.enQueue(head,4);
        head = queueFromLinkedList.enQueue(head,5);
        head = queueFromLinkedList.enQueue(head,6);

        head = queueFromLinkedList.deQueue(head);
        head = queueFromLinkedList.deQueue(head);
        singleLinkedListUtil.displaySingleLinkedList(head);



    }
}
