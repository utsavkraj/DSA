package com.utsav.dsa.dataStructures.linkedList.singleLinkedList;

import java.util.Arrays;

public class SingleLinkedListMain {
    public static void main(String[] args) throws Exception {
        SingleLinkedListUtil singleLinkedListUtil = new SingleLinkedListUtil();
        Integer[] arr = {0,1,2,3,4,5,6};
        System.out.println("Adding " + Arrays.toString(arr) + " to LinkedList:");
        Node root = singleLinkedListUtil.addArrayToLinkedList(arr);
        singleLinkedListUtil.displaySingleLinkedList(root);
        System.out.println("Mid element of " + Arrays.toString(arr) + " is:");
        FindMiddleElementInLinkedList findMiddleElementInLinkedList = new FindMiddleElementInLinkedList();
        findMiddleElementInLinkedList.findMiddleElement2ptrMethod(root);
        findMiddleElementInLinkedList.findMiddleElement2TransitionMethod(root);

    }
}
