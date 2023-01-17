package com.bridgelabz;

import javax.xml.crypto.Data;

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

}