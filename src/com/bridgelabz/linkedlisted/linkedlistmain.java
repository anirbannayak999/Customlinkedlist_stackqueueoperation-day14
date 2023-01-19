package com.bridgelabz.linkedlisted;

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
        Integer popLastElement = (Integer) linkedlist1.popLast();
        if(popLastElement == null)
            System.out.println("Empty linked list.");
        else
            System.out.println("POP Last Successfully done.Pop data : " + popLastElement);
        linkedlist1.dispaly();
        Node<Integer> searchElement = linkedlist1.search(30);
        if(searchElement == null)
            System.out.println("Element not Found.");
        else {
            System.out.println("Element Found.data ");
            System.out.println(searchElement);


        }
        linkedlist<Integer> Linkedlist4 = new linkedlist <>();

        Linkedlist4.append(56);
        Linkedlist4.append(30);
        Linkedlist4.append(70);
        Linkedlist4.dispaly();

        Linkedlist4.popAfter(30, 40);
        Linkedlist4.dispaly();

    }
}
