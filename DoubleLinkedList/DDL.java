package DoubleLinkedList;

import LinkedList.CoustemLinkedList;

public class DDL {

    private Node head;

    public void InstertF(int val) {
        Node node = new Node(val);
        node.next =head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display(){

        Node node = head;
        Node last  = null;

        while (node != null){
            System.out.print(node.value+"->");
            last = node ;
            node = node.next;
        }
        System.out.println("End");

        System.out.println("reverse print");

        while (last != null){
            System.out.print(last.value+"->");
            last= last.prev;

        }
        System.out.println("Start");
    }


    public void insertL(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next!= null){
            last = last.next;
        }

        last.next = node ;
        node.prev = last ;

    }
    public Node find(int value){
       Node node = head;
        while(node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after , int value){
        Node p = find (after);
        if(p== null){
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null) {
            node.next.prev = node;
        }

    }


     private class Node{
        private int value;
        private Node next;
        private Node prev;




        public Node(int val){
            this.value= val;
        }

        public Node(int value,Node next , Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;

        }

    }




}
