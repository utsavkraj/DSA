package com.utsav.dsa.dataStructures.linkedList.singleLinkedList;

public class RotateLinkedList {

    public <T> Node<T> rotateLinkedList(Node head, int rotateValue){
        SingleLinkedListUtil singleLinkedListUtil = new SingleLinkedListUtil();
        int length = singleLinkedListUtil.lengthOfLinkedList(head);
        rotateValue = rotateValue%length;
        if(rotateValue==0){
            return head;
        }
        Node current = head;
        Node prev = null;
        Node temp = null;
        while (length>0){
            if(rotateValue==0){
                prev.setNextNode(null);
                temp = current;
            }
            prev = current;
            current = current.getNextNode();
            length--;
            rotateValue--;
        }
        prev.setNextNode(head);
        head = temp;
        return head;
    }
}
