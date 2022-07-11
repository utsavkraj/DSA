package com.utsav.dsa.dataStructures.linkedList.singleLinkedList;

public class SingleLinkedListUtil {

    public void displaySingleLinkedList(Node head) {
        //if head is null obviously we can't just display anything so display null
        if (head == null) {
            System.out.println("null");
        } else {
            //calling recursion and passing nextNode and each recursion would
            // print the data of the node passed to it
            System.out.print(head.getData() + "->");
            displaySingleLinkedList(head.getNextNode());
        }
    }

    public <T> Node<T> addArrayToLinkedList(T[] array){
        //If array is null we'd get null pointer error. So adding a check
        if(array.length==0) {
            return null;
        }
        //making array[0] as head
        Node<T> head = new Node<>(array[0],null);
        //creating a pointer and at first it points at head
        // and keeps on increasing and points to new Node created
        Node<T> pointer = head;
        for (int i=1;i< array.length;i++){
            Node<T> newNode = new Node<>(array[i],null);
            pointer.setNextNode(newNode);
            pointer = newNode;
        }
        return head;
    }

    public <T> Node<T> addNode(Node head,T value){
        //If head is null we obviously can't add new node. So we create a new node and return it
        if(head==null){
            return new Node(value,null);
        }
        //If head is not null then pointer should travel till the end
        // and use the pointer to point to the new node
        else {
            Node pointer = head;
            Node newNode = new Node(value,null);
            while(true){
                if(pointer.getNextNode()==null){
                    break;
                }
                else {
                    pointer = pointer.getNextNode();
                }
            }
            pointer.setNextNode(newNode);
            return head;
        }
    }

    public <T> Node<T> addNodeWithIndex(Node head, T value, int index) throws Exception {
        Node newNode = new Node(value, null);
        Node current = head;
        Node prev = null;
        int length = this.lengthOfLinkedList(head);
        if(index > length || index<0){
            throw new Exception("Bad Index");
        }
        if(index == 0){
            newNode.setNextNode(head);
            head = newNode;
            return head;
        }
        while (true){
            if(index==0){
                break;
            }
            prev = current;
            current = current.getNextNode();
            index--;
        }
        newNode.setNextNode(current);
        prev.setNextNode(newNode);
        return head;
    }

    public <T> Node<T> deleteNodeWIthIndex(Node head, int value) throws Exception {
        Node pointer = head;
        if(value==0){
            head = head.getNextNode();
            return head;
        }
        if(value==1){
            head.setNextNode(head.getNextNode().getNextNode());
            return head;
        }
        else {
            value=value-1;
            while(value>0){
                pointer = pointer.getNextNode();
                value--;
                if (pointer.getNextNode()==null){
                    value++;
                    break;
                }
            }
            if(value>0){
                throw new Exception("Index out of bound");
            }
            pointer.setNextNode(pointer.getNextNode().getNextNode());
        }
        return head;
    }

    public void deleteNodeWithPointer(Node pointer) throws Exception {
        Node temp = pointer;
        pointer.setData(temp.getNextNode().getData());
        pointer.setNextNode(temp.getNextNode().getNextNode());
    }

    public int lengthOfLinkedList(Node head) {
        if (head == null) {
            return 0;
        }
        int count = 0;
        Node pointer = head;
        while (pointer != null) {
            if (pointer.getNextNode() == null) {
                count++;
                break;
            }
            pointer = pointer.getNextNode();
            count++;
        }
        return count;
    }
}
