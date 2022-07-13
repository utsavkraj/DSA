package com.utsav.dsa.dataStructures.linkedList.singleLinkedList;

import java.util.Arrays;

public class SingleLinkedListMain {
    public static void main(String[] args) throws Exception {
        SingleLinkedListUtil singleLinkedListUtil = new SingleLinkedListUtil();
        Integer[] arr = {100};
        Integer[] arr2 = {1,2,3,4,5};
        Node head1 = singleLinkedListUtil.addArrayToLinkedList(arr);
        Node head2 = singleLinkedListUtil.addArrayToLinkedList(arr2);

        PairwiseSwap pairwiseSwap = new PairwiseSwap();
        head2 = pairwiseSwap.pairwiseSwap(head2);
        singleLinkedListUtil.displaySingleLinkedList(head2);
    }
}
