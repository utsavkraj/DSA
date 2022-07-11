package com.utsav.dsa.dataStructures.linkedList.singleLinkedList;

public class CircularLinkedListCheck {

    public void isLinkedListCircular(Node head){
        Node slowPtr = head;
        Node fastPtr = head;
        do {
            slowPtr = slowPtr.getNextNode();
            fastPtr = fastPtr.getNextNode().getNextNode();
            if(slowPtr == fastPtr)
            {
                System.out.println("Linked list is circular");
                return;
            }
        }
        while (fastPtr.getNextNode()!=null);
        System.out.println("Linked list is NOT circular");

    }
}
