package com.utsav.dsa.dataStructures.linkedList.singleLinkedList;

import java.util.Arrays;

public class SingleLinkedListMain {
    public static void main(String[] args) throws Exception {
        SingleLinkedListUtil singleLinkedListUtil = new SingleLinkedListUtil();
        Integer[] arr = {100};
        Integer[] arr2 = {2,4,9,10};
        Node head1 = singleLinkedListUtil.addArrayToLinkedList(arr);
        Node head2 = singleLinkedListUtil.addArrayToLinkedList(arr2);

        MergeTwoSortedLinkedList mergeTwoSortedLinkedList = new MergeTwoSortedLinkedList();

        System.out.println("Merging " + Arrays.toString(arr) + " and "+Arrays.toString(arr2));
        singleLinkedListUtil.displaySingleLinkedList(mergeTwoSortedLinkedList.mergeSortedLinkedLists(head1,head2));
    }
}
