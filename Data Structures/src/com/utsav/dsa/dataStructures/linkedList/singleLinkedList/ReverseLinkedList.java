package com.utsav.dsa.dataStructures.linkedList.singleLinkedList;

public class ReverseLinkedList {
    public <T> Node<T> reverseLinkedList(Node<T> head){
        Node<T> p = head;
        Node<T> q = null;
        Node<T> r = null;
        System.out.println("P"+p.getData());
        while(p!=null){
            q = p;
            p = p.getNextNode();
            q.setNextNode(r);
            r = q;
        }
        head = q;
        return head;
    }
}
