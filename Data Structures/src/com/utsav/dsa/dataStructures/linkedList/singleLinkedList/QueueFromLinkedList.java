package com.utsav.dsa.dataStructures.linkedList.singleLinkedList;

public class QueueFromLinkedList {

    public <T> Node<T> enQueue(Node head, T value){
        SingleLinkedListUtil singleLinkedListUtil = new SingleLinkedListUtil();
        return singleLinkedListUtil.addNode(head,value);
    }
    public <T> Node<T> deQueue(Node head){
        System.out.println("deQueue:"+head.getData());
        head = head.getNextNode();
        return head;
    }

}
