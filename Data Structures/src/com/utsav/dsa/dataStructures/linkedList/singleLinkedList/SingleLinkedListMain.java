package com.utsav.dsa.dataStructures.linkedList.singleLinkedList;

import java.util.Arrays;

public class SingleLinkedListMain {
    public static void main(String[] args) throws Exception {
        SingleLinkedListUtil singleLinkedListUtil = new SingleLinkedListUtil();
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Adding " + Arrays.toString(arr) + " to LinkedList:");
        Node head = singleLinkedListUtil.addArrayToLinkedList(arr);
        singleLinkedListUtil.displaySingleLinkedList(head);


        head = reverseLinkedList.reverseLinkedList(head);
        singleLinkedListUtil.displaySingleLinkedList(head);

    }
}
