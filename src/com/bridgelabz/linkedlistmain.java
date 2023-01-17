package com.bridgelabz;

public class linkedlistmain {
    public static void main(String[] args) {
        linkedlist linkedlist1=new linkedlist();
        linkedlist1.push(10);
        linkedlist1.push(30);
        linkedlist1.push(56);
        linkedlist1.push(70);
        linkedlist1.dispaly();
        Integer popData = (Integer) linkedlist1.pop();
        if(popData == null) {
            System.out.println("Empty linked list.");
        }else
            System.out.println("POP First Successfully done.Pop data : " + popData);
        linkedlist1.dispaly();


    }
}
