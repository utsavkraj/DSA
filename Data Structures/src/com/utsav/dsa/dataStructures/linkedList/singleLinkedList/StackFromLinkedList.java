package com.utsav.dsa.dataStructures.linkedList.singleLinkedList;

public class StackFromLinkedList {

    public <T> Node<T> push(Node head, T value){
        Node newNode = new Node(value, null);
        newNode.setNextNode(head);
        head = newNode;
        return head;
    }

    public <T> Node<T> pop(Node head){
        System.out.println("Pop:"+head.getData());
        head = head.getNextNode();
        return head;
    }

    public void peek(Node head){
        System.out.println("Peek:"+head.getData());
    }
}
