package com.utsav.dsa.dataStructures.linkedList.singleLinkedList;

public class PairwiseSwap {

    public <T> Node<T> pairwiseSwap(Node<T> head) {
        if (head.getNextNode() == null) {
            return head;
        }
        Node current = head;
        Node next = head.getNextNode();
        while (true) {
            Object temp1 = current.getData();
            current.setData(next.getData());
            next.setData(temp1);
            if (next.getNextNode() == null || next.getNextNode().getNextNode() == null) {
                break;
            }
            current = current.getNextNode().getNextNode();
            next = next.getNextNode().getNextNode();
        }
        return head;
    }
}
