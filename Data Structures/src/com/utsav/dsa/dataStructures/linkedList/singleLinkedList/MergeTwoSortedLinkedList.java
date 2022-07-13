package com.utsav.dsa.dataStructures.linkedList.singleLinkedList;

public class MergeTwoSortedLinkedList {
    public Node<Integer> mergeSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> head3;
        Node<Integer> current1 = head1;
        Node<Integer> current2 = head2;
        Node<Integer> temp1 = null;
        Node<Integer> temp2 = null;
        if (head1.getData() < head2.getData()) {
            head3 = head1;
        } else {
            head3 = head2;
        }
        while (true) {
            if (current1.getData() < current2.getData()) {
                temp1 = current1;
                if (current1.getNextNode() == null) {
                    current1.setNextNode(current2);
                    break;
                }
                current1 = current1.getNextNode();
                if (current1.getData() > current2.getData()) {
                    temp1.setNextNode(current2);
                }
            } else {
                temp2 = current2;
                if (current2.getNextNode() == null) {
                    current2.setNextNode(current1);
                    break;
                }
                current2 = current2.getNextNode();
                if (current1.getData() < current2.getData()) {
                    temp2.setNextNode(current1);
                }
            }
        }
        return head3;
    }
}
