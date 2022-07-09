package com.utsav.dsa.dataStructures.linkedList.singleLinkedList;

import java.util.Arrays;

public class SingleLinkedListMain {
    public static void main(String[] args) throws Exception {
        SingleLinkedListUtil singleLinkedListUtil = new SingleLinkedListUtil();
        Integer[] arr = {0,1,2,3,4,5,6};
        System.out.println("Adding " + Arrays.toString(arr) + " to LinkedList:");
        Node root = singleLinkedListUtil.addArrayToLinkedList(arr);
        singleLinkedListUtil.displaySingleLinkedList(root);

        int index = 8;
        System.out.println("Deleting index:" + index + " in the LinkedList:");
        root = singleLinkedListUtil.deleteNodeWIthIndex(root,index);
        singleLinkedListUtil.displaySingleLinkedList(root);


//        Integer value = 7;
//        System.out.println("Adding a new node with value: " + value + " to LinkedList:");
//        root = singleLinkedListUtil.addNode(root, value);
//        singleLinkedListUtil.displaySingleLinkedList(root);
//
//        Integer[] arr2 = {8,9,10};
//        System.out.println("Adding array"+Arrays.toString(arr2) +" in addNode method");
//        for (int i=0;i<arr2.length;i++){
//            root = singleLinkedListUtil.addNode(root, arr2[i]);
//        }
//        singleLinkedListUtil.displaySingleLinkedList(root);


    }
}
