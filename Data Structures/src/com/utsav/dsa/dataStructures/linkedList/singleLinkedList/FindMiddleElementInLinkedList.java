package com.utsav.dsa.dataStructures.linkedList.singleLinkedList;

public class FindMiddleElementInLinkedList {

    private SingleLinkedListUtil singleLinkedListUtil = new SingleLinkedListUtil();
    public void findMiddleElement2ptrMethod(Node head){
        int count = singleLinkedListUtil.lengthOfLinkedList(head);
        if(count<3){
            throw new RuntimeException("Mid element can't be calculated if Linked list length is less than 3");
        }
        Node slowPtr = head;
        Node fastPtr = head;
        while (true){
            slowPtr = slowPtr.getNextNode();
            fastPtr = fastPtr.getNextNode().getNextNode();
            if(fastPtr.getNextNode()==null || fastPtr.getNextNode().getNextNode()==null){
                break;
            }
        }
        System.out.println(slowPtr.getData());
    }

    public void findMiddleElement2TransitionMethod(Node head){
        int count = singleLinkedListUtil.lengthOfLinkedList(head);
        if(count<3){
            throw new RuntimeException("Mid element can't be calculated if Linked list length is less than 3");
        }
        if(count%2==0){
            count=count-1;
        }
        int midIndex = count/2;
        Node pointer = head;
        while (midIndex>0){
            pointer = pointer.getNextNode();
            midIndex--;
        }
        System.out.println(pointer.getData());
    }

}
