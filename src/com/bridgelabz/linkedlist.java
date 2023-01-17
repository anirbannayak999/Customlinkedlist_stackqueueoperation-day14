package com.bridgelabz;

import javax.xml.crypto.Data;

public class linkedlist<K> {
    Node<K> head;
    Node<K> tail;

    void push(K data) {
        Node<K> newnode1 = new Node<>(data);
        if (head == null) {
            head = newnode1;
            tail = newnode1;

        } else {
            newnode1.next = head;
            head = newnode1;
        }
    }

    void dispaly() {
        Node<K> temp = head;
        while (temp != null) {
            System.out.println("the temp"+temp.data);
            temp = temp.next;

        }


    }

}