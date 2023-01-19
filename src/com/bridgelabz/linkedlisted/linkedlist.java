package com.bridgelabz.linkedlisted;

public class linkedlist<E> {
    Node<E> head;
    Node<E> tail;

    void push(E data) {
        Node<E> newnode1 = new Node<>(data);
        if (head == null) {
            head = newnode1;
            tail = newnode1;

        } else {
            newnode1.next = head;
            head = newnode1;
        }
    }

    void dispaly() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.println("the temp append data"+temp.data);
            temp = temp.next;

        }


    }
    void append(E value){
        Node<E> newNode = new Node(value);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    /*delete the 1st node(head) of a linkedlist */
    E pop() {
        if(head == null){
            return null;
        }else {
            E popData = head.data;
            head = head.next;
            return popData;
        }
    }E popLast() {
        if(head == null)
            return null;

        E popLastData = tail.data;
        Node<E> temp = head;
        while(temp.next != tail) {
            temp = temp.next;
        }
        tail = temp;
        temp.next = null;
        return popLastData;
    }
    /* Searching a node in linked list */
    Node<E> search(E value) {
        if(head == null)
            return null;

        Node<E> temp = head;
        while(temp != null) {
            if(temp.data.equals(value))
                return temp;
            temp = temp.next;
        }
        return null;
    }	 void popAfter(E previous, E data) {
        if (head == null) {
            System.out.println("Node not found!!!");
            return;
        }
        Node<E> temp = head;
        while (temp != null) {
            if (temp.data.equals(previous)) {
                Node<E> newNode = new Node(data);
                Node<E> nextNode = temp.next;
                temp.next = newNode;
                newNode.next = nextNode;

                System.out.println("Node added successfully");
                return;
            }
            temp = temp.next;
        }

    }
    int size() {
        int count = 0;
        if(head == null)
            return count;
        Node<E> temp = head;
        while(temp != null) {
            count ++;
            temp = temp.next;
        }
        System.out.println("Size of the linked list is : " + count);
        return count;
    }

    /* Delete a node  */
    void pop(E data) {
        if(head == null) {
            System.out.println("Empty LinkedList");
            return;
        }

        Node<E> temp = head;
        while(temp != null) {
            if(temp.next.data.equals(data)) {
                temp.next = temp.next.next;
                System.out.println(data + " successfully deleted.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not Found!!!");
    }
}